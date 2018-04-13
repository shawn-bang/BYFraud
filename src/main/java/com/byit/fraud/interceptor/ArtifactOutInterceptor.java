package com.byit.fraud.interceptor;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Desc    : Solve Problem:Customize response xml content style
 * @author : shawn
 * @date   : 2018/4/3 17:10
 */
public class ArtifactOutInterceptor extends AbstractPhaseInterceptor<Message> {
	private final Logger logger = LoggerFactory.getLogger(ArtifactOutInterceptor.class);

	public ArtifactOutInterceptor() {
		super(Phase.PRE_STREAM);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		OutputStream outputStream = message.getContent(OutputStream.class);
		if (null != outputStream) {
			try {
				CachedOutputStream cs = new CachedOutputStream();
				message.setContent(OutputStream.class, cs);
				message.getInterceptorChain().doIntercept(message);
				CachedOutputStream csnew = (CachedOutputStream) message.getContent(OutputStream.class);
				InputStream in = csnew.getInputStream();

				String xml = IOUtils.toString(in);
				logger.info("Capture the output xml content: {}", xml);

				// customize response xml content style
				xml = xml.replace("ns2", "ns1");
				xml = xml.replace("return", "ns1:out");

				IOUtils.copy(new ByteArrayInputStream(xml.getBytes("UTF-8")), outputStream);
				cs.close();
				outputStream.flush();
				message.setContent(OutputStream.class, outputStream);
			} catch (IOException e) {
				logger.error("Error when handle original outputStream. CausedBy : ", e);
			}
		}
	}
}

package com.byit.fraud.interceptor;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shawn on 2018/04/3.
 * Solve Problem:Customize request xml content style
 */
public class ArtifactInInterceptor extends AbstractPhaseInterceptor<Message> {
	private final Logger logger = LoggerFactory.getLogger(ArtifactInInterceptor.class);

	public ArtifactInInterceptor() {
		super(Phase.RECEIVE);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		InputStream inputStream = message.getContent(InputStream.class);
		if (null != inputStream) {
			try {
				String xml = IOUtils.toString(inputStream);
				logger.info("Capture the Input xml content: {}", xml);

				// customize response xml content style
				xml = xml.replace("wstxns1:", "");
				logger.info("Be handled Input xml content: {}", xml);

				InputStream ism = new ByteArrayInputStream(xml.getBytes());
				message.setContent(InputStream.class, ism);
			} catch (IOException e) {
				logger.error("Error when handle original outputStream. CausedBy : ", e);
			}
		}
	}
}

package com.byit.fraud.cxf;

import com.byit.fraud.cxf.client.*;

import javax.xml.ws.Holder;

public class CXFClient {

	public static void main(String args[]) {
		DataManagementServicePortType dmService = new DMService().getDMService();


		RowIn rowIn = new RowIn();
		rowIn.setShenqingjianNo("123456");
		rowIn.setEntityType("ADD");
		rowIn.setDataSource("APP");
		rowIn.setDataType("homeaddr");
		rowIn.setDataValue("北京市昌平区回龙观荣泽家园6号院9号楼");

		TableIn in = new TableIn();
		in.getRow().add(rowIn);
		Holder<TableOut> result = new Holder<>();
		dmService.datasvcCcappRtMatchDdfIn(in, result);

		System.out.println(result.value.getRow().get(0).getAPPDistrictMC());
	}

}

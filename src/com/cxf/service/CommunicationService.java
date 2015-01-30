package com.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CommunicationService {

	@WebMethod(operationName="getWho",action="getWho")
	public String getWho(String name);
	
}



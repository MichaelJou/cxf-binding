package com.cxf.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.cxf.pojo.Person;

/**
 * 
 * @author zhouping
 *
 */
@WebService(endpointInterface="com.cxf.service.CommunicationService")
public class CommunicationServiceImpl implements CommunicationService {
  
	
	
	@Override
	public String getWho(String name) {
		
		 List<Person> personList = new ArrayList<Person>();
		 
		 for (int i = 0; i < 5; i++) {
			 Person person = new Person();
			 personList.add(person);
		}
		
		
		
		
		return null;
	}

}

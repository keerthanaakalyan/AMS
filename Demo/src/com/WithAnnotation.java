package com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WithAnnotation {
    @WebMethod
	public String method(){
		return "Hi.........";
	}

}

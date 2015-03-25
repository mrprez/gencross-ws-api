package com.mrprez.gencross.ws.api;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IAuthentificationService {
	public final static String TOKEN_KEY = "token";
	
	public String authentificate(String username, String digest) throws Exception;

}

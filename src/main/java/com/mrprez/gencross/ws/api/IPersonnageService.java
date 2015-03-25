package com.mrprez.gencross.ws.api;

import java.util.HashMap;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mrprez.gencross.disk.PluginDescriptor;

@WebService
@SOAPBinding(style = Style.RPC)
@HandlerChain(file = "handlers.xml")
@XmlSeeAlso(value=java.util.Map.class)
public interface IPersonnageService {
	
	
	@WebMethod
	PluginDescriptor[] getPluginList() throws Exception;

//	@WebMethod
//	HashMap<Integer,String> getPersonnageLabels(PluginDescriptor pluginDescriptor) throws Exception;

}

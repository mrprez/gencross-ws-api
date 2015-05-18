package com.mrprez.gencross.ws.api;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.mrprez.gencross.disk.PluginDescriptor;
import com.mrprez.gencross.ws.api.bo.PersonnageLabel;

@WebService
@SOAPBinding(style = Style.RPC)
@HandlerChain(file = "handlers.xml")
public interface IPersonnageService {
	
	
	@WebMethod
	PluginDescriptor[] getPluginList() throws Exception;

	@WebMethod
	PersonnageLabel[] getPersonnageLabels(PluginDescriptor pluginDescriptor) throws Exception;
	
	@WebMethod
	byte[] getPersonnage(int id) throws Exception;
	
	@WebMethod
	void savePersonnage(int personnageId, byte[] xml) throws Exception;

}

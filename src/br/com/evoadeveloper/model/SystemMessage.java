package br.com.evoadeveloper.model;

import org.json.simple.JSONObject;

public class SystemMessage {

	public static final String SUCCESS="";
	public static final String ERROR = "";
	public static final String INFO = "";
	

	@SuppressWarnings("unchecked")
	public JSONObject build(String pMessage) {
		JSONObject jsonMensagem = new JSONObject();
		jsonMensagem.put("message", pMessage);
		return jsonMensagem;
	}
}

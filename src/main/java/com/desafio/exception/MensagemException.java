package com.desafio.exception;

import java.util.Date;

public class MensagemException {

	private Date data;
	private int codigoHttp;
	private String field;
	private String mensagem;

	MensagemException(int codigoErro, String field, String mensagemErroServidor) {
		this.codigoHttp = codigoErro;
		this.field = field;
		this.mensagem = mensagemErroServidor;
		this.data = new Date();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCodigoHttp() {
		return codigoHttp;
	}

	public void setCodigoHttp(int codigoHttp) {
		this.codigoHttp = codigoHttp;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	

	
	

}

package com.ttdev;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Form;

import org.apache.cxf.jaxrs.client.WebClient;

import com.ttdev.receta.Receta;
import com.ttdev.token.Token;
import com.ttdev.usuario.Usuario;

public class DrupalClient {

	public static void main(String[] args) {
		
		WebClient client = WebClient.create("http://192.168.56.1/daw/rest");
		client.accept("application/xml");
		
		client.path("node/59");
		Receta receta = client.get(Receta.class);
		System.out.println("Titulo: " + receta.getTitle());
		System.out.println("Body: " + receta.getBody().getUnd().getItem().getValue());
		
		client.back(true);
		client.path("user/token");
		Token token = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null,Token.class);
		System.out.println("Token obtenido: " + token.getToken());
		
		client.back(true);
		client.path("user/login");
		client.header("x-CSRF-Token", token.getToken());
		
		Form form = new Form();			// Importamos el paquete a pelo: import.org.apache.cxf.jaxrs.ext.form.Form; o  import javax.ws.rs.core.Form;
		form.param("username", "test");	// Puede ser form.param dependiendo del import que rule
		form.param("password", "test");
		
		Usuario usuario = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form,Usuario.class);
		
		System.out.println("sessionname: " + usuario.getSessionName());
		System.out.println("sessioid: " + usuario.getSessid());
		System.out.println("sessiotoken: " + usuario.getToken());
		
		client.back(true);
		client.path("node/59");
		
		form = new Form();
		form.param("title","Recetita cremosita papu");
		
		client.header("cookie", usuario.getSessionName()+ "=" + usuario.getSessid());
		client.replaceHeader("x-CSRF-Token", usuario.getToken());
		
		//PUT
		
		String resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form, String.class);
		System.out.println("Respuesta: " + resp);

	}

}

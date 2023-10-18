package com.desafio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.TransactionSystemException;
import com.desafio.dto.UsuarioDto;
import com.desafio.service.UsuarioService;

@SpringBootTest
class DesafioApplicationTests {

	@Autowired
	UsuarioService servico;
	
	@Test
	void contextLoads() {
	}	
	
	@Test
	void testValidationIsNull() {
		
		UsuarioDto usuario = new UsuarioDto();
		usuario.setEmail(null);
		usuario.setSenha(null);
		usuario.setNome(null);	
		                       
		Assertions.assertThrows(TransactionSystemException.class, () -> this.servico.gravar(usuario));
		
	}
	
	@Test
	void testValidationSizeString() {
		
		UsuarioDto usuario = new UsuarioDto();
		usuario.setEmail("tsste@teste.com.br");
		usuario.setSenha("1");
		usuario.setNome("B");	
		                        
		Assertions.assertThrows(TransactionSystemException.class, () -> this.servico.gravar(usuario));
		
	}	
	@Test
	void testValidateionIsNull() {
		
		UsuarioDto usuario = new UsuarioDto();
		usuario.setEmail(null);
		usuario.setSenha(null);
		usuario.setNome(null);
		                         
		Assertions.assertThrows(TransactionSystemException.class, () -> this.servico.gravar(usuario));
	}
	
	@Test
	void testValidationEmail() {
		
		UsuarioDto usuario = new UsuarioDto();
		//Faltando o @ valida o email
		usuario.setEmail("brunoteste.com.br");
		usuario.setSenha("123456789102");
		usuario.setNome("Bruno Leandro de Carvalho");		
		                  
		Assertions.assertThrows(TransactionSystemException.class, () -> this.servico.gravar(usuario));
		
	}

}

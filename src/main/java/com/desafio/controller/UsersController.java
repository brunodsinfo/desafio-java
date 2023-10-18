package com.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafio.dto.UsuarioDto;
import com.desafio.service.UsuarioService;
import javax.validation.Valid;


@RestController
@RequestMapping(path = "/usuarios")
public class UsersController {

	@Autowired
	private UsuarioService servico;

	
	/*
	 * validações com mensagens personalizadas de erros de validação do bean validator
	 * 
	 * existe uma classe que centraliza todas as exceções e também as mensagens de erros de validação do bean validator usando a anotation @ControllerAdvice
	 * 
	 */
	@PostMapping
	public ResponseEntity<UsuarioDto> Salvar(@RequestBody @Valid UsuarioDto usuario) {
	
		return ResponseEntity.ok(this.servico.gravar(usuario));
	}

}

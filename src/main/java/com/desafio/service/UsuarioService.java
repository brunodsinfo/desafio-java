package com.desafio.service;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desafio.dto.UsuarioDto;
import com.desafio.entity.UsuarioEntity;
import com.desafio.repository.UsersRepository;


@Service
public class UsuarioService {

	@Autowired
	private UsersRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	
	public void gravaUsuario(UsuarioEntity user) {
		repository.save(user);		
	}
	
	
	public UsuarioDto gravar(UsuarioDto usuario){

        UsuarioEntity  user = this.repository.save(this.mapper.map(usuario,UsuarioEntity.class)); 	  
	
		return this.mapper.map(user,UsuarioDto.class);
	}
	
	
}

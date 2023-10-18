package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.entity.UsuarioEntity;

@Repository
public interface UsersRepository extends CrudRepository<UsuarioEntity, Integer>, JpaSpecificationExecutor<UsuarioEntity> {
	
	
}

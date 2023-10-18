package com.desafio.entity;

import java.util.Objects;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Table(name="usuario")
public class UsuarioEntity {
   
	@javax.persistence.Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotNull(message="É obrigatório informar o nome")
	@NotBlank(message = "não é permitido nome em branco")
	@Size(min = 3, max = 50, message = "não satisfeita a quantidade mínima de 3 caracteres")
	private String nome;
	
	private String senha;
	
	@NotNull(message="É obrigatório informar o email")
	@NotBlank(message = "não é permitido email em branco")
	@Size(min = 3, max = 50, message = "mínimo de 6 caracteres, máximo de 20 caracteres")
	@Email(message="informe um email válido")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", senha=" + senha + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEntity other = (UsuarioEntity) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}
	
	
	
}

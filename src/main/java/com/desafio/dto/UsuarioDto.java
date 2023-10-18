package com.desafio.dto;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UsuarioDto {

	private Integer id;
	
	@NotNull(message="É obrigatório informar o nome")
	@Size(min = 3, max = 50, message = "não satisfeita a quantidade de caracteres. Mínimo de 3 e máximo de 50 caracteres")
	@NotBlank(message = "não é permitido nome em branco")
	private String nome;
	
	@NotNull(message="É obrigatório informar o email")
	@NotBlank(message = "não é permitido email em branco")
	@Email(message="informe um email válido")
	private String email;
	
	@NotNull(message="É obrigatório informar a senha")
	@NotBlank(message = "não é permitido senha em branco")
	@Size(min = 6, max = 20, message = "a senha deve ter de 6 a 20 carcteres")
	private String senha;
	
	@NotNull(message="É obrigatório informar a confirmação de senha")
	@NotBlank(message = "não é permitido confirmação de senha")
	@Size(min = 6, max = 20, message = "a confirmação de senha deve ter de 6 a 20 carcteres")
	private String confirmacaoSenha;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}
	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(confirmacaoSenha, email, id, nome, senha);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDto other = (UsuarioDto) obj;
		return Objects.equals(confirmacaoSenha, other.confirmacaoSenha) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}
	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", confirmacaoSenha=" + confirmacaoSenha + "]";
	}

	
	
	
	
	
}

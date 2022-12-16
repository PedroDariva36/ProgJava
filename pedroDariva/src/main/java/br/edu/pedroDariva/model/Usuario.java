package br.edu.pedroDariva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sequencia")
    @SequenceGenerator(name="sequencia", sequenceName="seq1", initialValue = 1, allocationSize = 1)
    @Column(name = "id_usuario")
    private Integer id;

    @NotNull
    @Size(min = 3, max = 30)
    //@Pattern(regexp = "[^0-9]*")
    private String nome;

    @NotNull
    @NotEmpty
    @Size(min = 8, message = "Senha com minimo de 8 caracteres")
    private String senha;
    
    @NotNull
    @NotEmpty
    @Email
    //@Column(name = "email")
    private String email;

    @NotNull
    @NotEmpty
    //@Size(min = 11, max = 11)
    @CPF(message = "CPF invalido")
    private String cpf;
    
    
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}

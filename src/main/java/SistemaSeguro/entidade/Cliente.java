package SistemaSeguro.entidade;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
 class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cpf;
	
	@OneToMany
	private List<Endereco> endereco = new ArrayList();
	
	@OneToOne
	private Seguro seguro;

	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
	this.endereco.add(endereco);
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	
	public void addmaisEnderecos(Endereco e){ 
		endereco.add(e);
		}
	
	
	
	
	
	
	
	
	
	
}



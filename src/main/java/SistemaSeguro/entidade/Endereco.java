package SistemaSeguro.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String pais;
	private String estado;
	private String cidade;
	private String rua;
	
	
	@OneToMany
	private List<Cliente> clientes = new ArrayList();

	public Endereco(String pais, String estado, String cidade, String rua) {
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
	}

	public String getPais() {
		return pais;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getRua() {
		return rua;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente c) {
		clientes.add(c);
	}

}

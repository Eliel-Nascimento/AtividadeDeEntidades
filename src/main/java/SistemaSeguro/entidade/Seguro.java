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
public class Seguro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double precototal = 0;
	private String temposeguro;
	
	@OneToOne
	private Cliente cliente;
	
	@OneToMany
	private List<Carro> carro = new ArrayList();

	public Seguro(String temposeguro, Cliente cliente) {
		this.temposeguro = temposeguro;
		this.cliente = cliente;

	}

	public double getPrecototal() {
		return precototal;
	}

	public String getTemposeguro() {
		return temposeguro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Carro> getCarro() {
		return carro;
	}

	public void addnovoscarros(Carro c) {
		carro.add(c);
		this.precototal += c.getCotacao();
	}

}

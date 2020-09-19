package SistemaSeguro.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;
	private String modelo;
	private String placa;
	private double cotacao = 0;
	
	@OneToOne
	private String seguro;

	public Carro(String marca, String modelo, String placa, double cotacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cotacao = cotacao;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public double getCotacao() {
		return cotacao;
	}

	public String getSeguro() {
		return seguro;
	}

}

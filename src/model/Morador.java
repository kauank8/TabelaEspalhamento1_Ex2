package model;

public class Morador {
	private int numeroAp;
	private String nome;
	private String modeloCarro;
	private String cor;
	private String placaCarro;

	// Get e Setter
	public int getNumeroAp() {
		return numeroAp;
	}

	public void setNumeroAp(int numeroAp) {
		this.numeroAp = numeroAp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	// toSTring
	@Override
	public String toString() {
		return "Morador [numeroAp=" + numeroAp + ", nome=" + nome + ", modeloCarro=" + modeloCarro + ", cor=" + cor
				+ ", placaCarro=" + placaCarro + "]";

	}
}

package hotel;

public class Animal {

	private String nome;
	private String tipo;
	private int idade;

	public Animal(String nome, String tipo, int idade) throws Exception {

		if (nome == null || nome.trim().isEmpty()) {
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}

		if (tipo == null || tipo.trim().isEmpty()) {
			throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
		}

		if (idade < 0) {
			throw new Exception("Idade de um animal nao pode ser abaixo de 0");
		}

		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object objeto) {

		if (!(objeto instanceof Animal)) {
			return false;
		}

		Animal animal = (Animal) objeto;

		return this.getNome().equalsIgnoreCase(animal.getNome()) && this.getTipo().equalsIgnoreCase(animal.getTipo());

	}

}

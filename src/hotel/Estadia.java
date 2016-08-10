package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;

	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.valor = valor;
		this.dias = dias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %d dia(s) com o preco de R$ %.2f", this.getNome(), this.getTipo(), this.getDias(),
				this.getValor());
	}

}

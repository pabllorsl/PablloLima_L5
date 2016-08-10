package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList<Estadia> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equalsIgnoreCase(nome)) {
				estadias.remove(estadia);
			}
		}
	}

	public int getNumDeHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double lucroTotal = 0.0;
		for (Estadia estadia : estadias) {
			lucroTotal = lucroTotal + estadia.getValor();
		}
		return lucroTotal;
	}

	@Override
	public String toString() {
		String representacao = "Estadias:";
		for (Estadia estadia : estadias) {
			if (estadias.size() > 0) {
				representacao = representacao + String.format("\n%s (%s): %d dia(s) com o preco de R$ %.2f",
						estadia.getNome(), estadia.getTipo(), estadia.getDias(), estadia.getValor());
			}
		}
		return representacao;
	}

}

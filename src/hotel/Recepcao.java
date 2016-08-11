package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList<Estadia> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		int i = 0;
		while (estadias.size() > i) {
			if (estadias.get(i).getNome().equalsIgnoreCase(nome)) {
				estadias.remove(estadias.get(i));
			}
			i = i + 1;
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
				representacao = representacao + "\n" + estadia.toString();
			}
		}
		return representacao;
	}

}

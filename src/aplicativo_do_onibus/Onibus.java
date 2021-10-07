package aplicativo_do_onibus;

import java.util.ArrayList;

public class Onibus {
	
	private int codigo;
	private String nome;
	private double tarifa;
	private ArrayList<Passageiro> lista;
	
	public void incluirPassageiro(Passageiro _passageiro) {
		this.lista.add(_passageiro);
	}
	
	public void listarPassageiros() {
		
	}
	
}

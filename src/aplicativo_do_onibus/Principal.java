package aplicativo_do_onibus;

public class Principal {

	public static void main(String[] args) {

		Passageiro p1 = new Passageiro(001, "Arthur", 23, false);
		Passageiro p2 = new Passageiro(002, "Mick", 26, true);
		Passageiro p3 = new Passageiro(001, "Everton", 60, false);
		
		System.out.println(p1.pagarPassagem(3.60)); 
		System.out.println(p2.pagarPassagem(3.60));
		System.out.println(p3.pagarPassagem(3.60));
		
	}

}

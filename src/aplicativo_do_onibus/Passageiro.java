package aplicativo_do_onibus;

public class Passageiro {
	
	private int codigo;
	private String nome;
	private int idade;
	private boolean estudante;
	
	public Passageiro(int _codigo, String _nome, int _idade, boolean _estudante) {
		this.codigo = _codigo;
		this.nome = _nome;
		this.idade = _idade;
		this.estudante = _estudante;
	}

	public double pagarPassagem(double _tarifa){
		double pagarValor = 0;
		if(idade >= 60) 
			pagarValor = _tarifa * 0;
		else if(estudante = true) 
			pagarValor = _tarifa / 2;
		return pagarValor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstudante() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}
	
	
}

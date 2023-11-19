package aula7;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador() {
		
	}
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
			int vitorias, int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	public void apresentar() {
		System.out.println("----------------------------------------");
		System.out.println("Apresentamos o lutador " + this.getNome());
		System.out.println("Direamente de "+this.getNacionalidade());
		System.out.println("Com "+this.getIdade()+" anos");
		System.out.println("Com "+this.getAltura()+" de altura");
		System.out.println("Pesando "+this.getPeso());
		System.out.println(this.getVitorias() +" Vitórias");
		System.out.println(this.getDerrotas() +" Derrotas");
		System.out.println(this.getEmpates() + " Empates");
		System.out.println("----------------------------------------");
	}
	public void status() {
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println(this.getVitorias() +" Vitórias");
		System.out.println(this.getDerrotas() +" Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}
	public void ganharLuta(){
		this.setVitorias(this.getVitorias() +1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() +1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getNacionalidade() {
		return nacionalidade;
	}
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	private int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	private double getPeso() {
		return peso;
	}
	private void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(peso<52.2) {
			this.categoria = "Inválido";
		}else if(peso<70.3){
			this.categoria = "Leve";
		}else if(peso<83.9) {
			this.categoria = "Médio";
		}else if(peso<120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
		
		
		
	}
	private int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	private int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	private int getEmpates() {
		return empates;
	}
	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
	
	
}

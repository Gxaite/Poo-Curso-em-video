package aula2;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	public Caneta() {
		
	}
	public Caneta(String modelo, double ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("A caneta é " + this.modelo);
		System.out.println("Com a cor "+ this.cor);
		System.out.println("Está tampada? "+ this.tampada);
		System.out.println("A ponta é "+this.ponta);
		System.out.println("Carga: "+this.carga);
		
	}
	
	public void escrever() {
		
	}
	public void rabiscar() {
		if (this.tampada == true){
			System.out.println("Erro! não posso rabiscar");
		}
		
		else {
			System.out.println("Estou rabiscando");
		}
			
	}
	
	public void pintar() {
		
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
	
	public String getModelo() {
		System.out.println(this.modelo);
		return this.modelo;	
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPonta() {
		System.out.println(this.ponta);
		return this.ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	

}

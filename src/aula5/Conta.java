package aula5;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String nomeDono;
	private double saldo;
	private boolean status;
	
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+ this.getTipoConta());
		System.out.println("Dono: "+this.getNomeDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
	public void abrirConta(String tipo) {
		this.setStatus(true);
		this.setTipoConta(tipo);
		if (this.getTipoConta() == "cc"){
			this.depositar(50);
		}else {
			this.depositar(150);
		}
		
	}
	public void fecharConta() {
		if (this.getSaldo() == 0) {
			System.out.println("Sua conta foi fechada");
			this.status = false;
		}else if (saldo<0) {
			System.out.println("Você está em débito com o banco");
		}else {
			System.out.println("Você possui dinheiro dentro da conta");
		}
	}
	public void depositar(double deposito) {
		if (this.status){
			this.setSaldo(this.getSaldo()+deposito);
		}else {
			System.out.println("Você não tem uma conta aberta");
		}
	}
	
	public void sacar(double saque) {
		if(this.getStatus()) {
			if (this.getSaldo()< saque) {
				System.out.println("Saldo insuficiente");
			}
			else {
				System.out.println("Saque de R$ "+saque+" realizado");
				this.setSaldo(this.getSaldo()-saque) ;
			}
		}else {
			System.out.println("Erro, a conta está fechada!");
		}
		
	}
	public void pagarMensal() {
		if (this.getTipoConta() == "cc"){
			this.sacar(12);;
		}else {
			this.sacar(20);
			
		}
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}

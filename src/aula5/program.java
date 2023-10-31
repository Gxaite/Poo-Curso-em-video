package aula5;

public class program {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.setNomeDono("Carlos");
		c1.setNumConta(123456);
		c1.abrirConta("cc");
		c1.depositar(300);
		c1.sacar(30);
		
		
		
		
		
		
		
		c1.estadoAtual();
	}

}

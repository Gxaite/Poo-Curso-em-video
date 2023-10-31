package aula2;

public class aula2Exercicio {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.setModelo("Bic");
		c1.setPonta(0.5);
		c1.getModelo();
		c1.getPonta();
		
		c1.status();
		c1.tampar();
		c1.rabiscar();
		System.out.println();
		
		Caneta c2 = new Caneta("Pentel",0.7,"Vermelha");
		c2.status();

	}

}

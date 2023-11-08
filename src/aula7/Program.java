package aula7;

public class Program {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[2];
		l[0] = new Lutador("Bruno","Brasil", 35, 1.86, 95.05, 5, 7, 1);
		l[1]= new Lutador("Pretty Boy","França",31,1.75,68.9,11,2,1);
		l[0].status();
		l[1].apresentar();

	}

}

package aula7;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1 != l2 && l1.getCategoria() == l2.getCategoria()) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			}
		
		}
	public void lutar() {
		if (this.aprovada){
			Random aleatorio = new Random();
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			int vencedor = aleatorio.nextInt(0,2);
			
				switch (vencedor) {
				case 0:
					System.out.println("Luta empatada");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("Desafiado venceu");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println("Desafiante venceu");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
				
				}
			
		}else {
			System.out.println("A luta não pode acontecer");
		}
		
	}


	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
	
	
}

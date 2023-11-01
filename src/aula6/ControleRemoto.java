package aula6;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	
	public void ligar() {
		this.setLigado(true);		
	}


	public void desligar() {
		this.setLigado(false);
	}


	public void abriMenu() {
		System.out.println("-----Menu-----");
		System.out.println("Esta ligado? "+this.getLigado());
		System.out.println("Esta tocando? "+this.getTocando());
		System.out.println("Volume: "+this.getVolume());
		for(int i=0;i<this.getVolume();i+=10) {
			System.out.print("| ");
		}
		System.err.println("--------------");
	}


	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume()+5);
		}else {
			System.out.println("Impossivel Aumentar o volume");
		}
	}


	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume()-5);
		}else {
			System.out.println("Impossivel diminuir o volume");
		}
	}
	
	
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
	}


	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}


	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}


	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	
}

package aula9;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
		this.setAberto(false);
		this.setPagAtual(0);
	}

	
	public String detalhes() {
		return "Livro [titulo=" + this.titulo + ", autor=" + this.autor + ", totPaginas=" + this.totPaginas + ", pagAtual=" + this.pagAtual
				+ ", aberto=" + this.aberto + ", leitor=" + this. leitor + "]";
	}




	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		
	}

	@Override
	public void folhear(int p) {
		this.setPagAtual(p);
		
	}

	@Override
	public void avancarPag() {
		this.setPagAtual(getPagAtual()+1);
		
	}

	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual()-1);
	
	}
	
	

}

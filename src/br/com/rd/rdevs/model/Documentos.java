package br.com.rd.rdevs.model;

public abstract class Documentos {
	private String tipoDocumento;
	private int numeroRegistro;
	private String nomePessoa1;
	private String nomePessoa2;
	private String dataEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	
	public abstract String getTipoDocumento();
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getNomePessoa1() {
		return nomePessoa1;
	}
	public void setNomePessoa1(String nomePessoa1) {
		this.nomePessoa1 = nomePessoa1;
	}
	public String getNomePessoa2() {
		return nomePessoa2;
	}
	public void setNomePessoa2(String nomePessoa2) {
		this.nomePessoa2 = nomePessoa2;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
	
	public Documentos(int numeroRegistro, String nomePessoa1, String nomePessoa2, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
		this.numeroRegistro = numeroRegistro;
		this.nomePessoa1 = nomePessoa1;
		this.nomePessoa2 = nomePessoa2;
		this.dataEmissao = dataEmissao;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
	}
	
	
}

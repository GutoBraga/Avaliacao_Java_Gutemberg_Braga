package br.com.rd.rdevs.model;

public class Certidao extends Documentos implements QuantidadeRegistros {
	
	private int qtdCertidoes;
	private String nomeMae;
	private String nomePai;
	
	
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public Certidao(int numeroRegistro, String nomePessoa1, String nomePessoa2, String dataEmissao, String nomeTabeliao, String nomeCartorio, String nomeMae, String nomePai) {
		super(numeroRegistro, nomePessoa1, nomePessoa2, dataEmissao, nomeTabeliao, nomeCartorio);
		this.nomeMae = nomeMae;
		this.nomeMae = nomePai;
	}
	
	public String getNascimento(Certidao certidao) {
		try {
			if(this.getNomePessoa1() == null ) {
				throw new IllegalArgumentException("Nome da pessoa é obrigatório");
			} else {
				return 	this.getTipoDocumento() + " de Nascimento " +
						this.getNomePessoa1() + " nasceu em " + 
						this.getDataEmissao() + " Filho de " + 
						this.nomeMae + " com " + 
						this.nomePai + ".Registro do documento em questão é: " + 
						this.getNumeroRegistro() + " Registrado no cartório: " +
						this.getNomeCartorio() + " Pelo Tabelião: " + 
						this.getNomeTabeliao();
			}} catch(Exception e) {
				throw new IllegalArgumentException("Erro." + e.getMessage());
			}
		}
	
	public String getCasamento(Certidao certidao) {
		return 	this.getTipoDocumento() + " de Casamento " +
				this.getNomePessoa1() + " se casou com " + 
				this.getNomePessoa2() + " em " +
				this.getDataEmissao() + ".Registro do documento em questão é: " + 
				this.getNumeroRegistro() + " Registrado no cartório: " +
				this.getNomeCartorio() + " Pelo Tabelião: " + 
				this.getNomeTabeliao();
	}
	
	public String getFalecimento(Certidao certidao) {
		return 	this.getTipoDocumento() + " de Felecimento " +
				this.getNomePessoa1() + " falesceu em " + 
				this.getDataEmissao() + " Filho de " + 
				this.nomeMae + " com " + 
				this.nomePai + ".Registro do documento em questão é: " + 
				this.getNumeroRegistro() + " Registrado no cartório: " +
				this.getNomeCartorio() + " Pelo Tabelião: " + 
				this.getNomeTabeliao();
	}
	@Override
	public String getTipoDocumento() {
		return "Certidão";
	}
	@Override
	public int qtdRegistros() {
		return qtdCertidoes ++;
	}
	
}

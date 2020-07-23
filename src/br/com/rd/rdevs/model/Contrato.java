package br.com.rd.rdevs.model;

public class Contrato extends Documentos implements QuantidadeRegistros {

	private String nomeTestemunha1;
	private String nomeTestemunha2;
	private String dataRegistro;
	private int qtdContratos;
	
	public String getNomeTestemunha1() {
		return nomeTestemunha1;
	}

	public void setNomeTestemunha1(String nomeTestemunha1) {
		this.nomeTestemunha1 = nomeTestemunha1;
	}

	public String getNomeTestemunha2() {
		return nomeTestemunha2;
	}

	public void setNomeTestemunha2(String nomeTestemunha2) {
		this.nomeTestemunha2 = nomeTestemunha2;
	}

	public String getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public Contrato(int numeroRegistro, String nomePessoa1, String nomePessoa2, String nomeTestemunha1, String nomeTestemunha2, String dataEmissao, String dataRegistro, String nomeTabeliao,
			String nomeCartorio) {
		super(numeroRegistro, nomePessoa1, nomePessoa2, dataEmissao, nomeTabeliao, nomeCartorio);
		this.nomeTestemunha1 = nomeTestemunha1;
		this.nomeTestemunha2 = nomeTestemunha2;
		this.dataRegistro = dataRegistro;
	}

	public String getCompraVenda(Contrato contrato) {
			try {
				if (this.getNomePessoa1() == null || this.getNomePessoa1() == null ) {
				throw new IllegalArgumentException("obrigatório o nome do vendedor e comprador ");
			} else {
			return 	this.getTipoDocumento() + " de Compra e venda " +
					this.getNomePessoa1() + " Comprou de " + 
					this.getNomePessoa2() + " um Fiat Uno, cuja data de emissão é " + 
					this.getDataEmissao() + ".Testemunha 1 é: " + 
					this.nomeTestemunha1 + " Testemunha 2 é: " + 
					this.nomeTestemunha2 + ".Registro do documento em questão é: " + 
					this.getNumeroRegistro() + " Registrado no cartório: " +
					this.getNomeCartorio() + " Pelo Tabelião: " + 
					this.getNomeTabeliao() + " data de registro é: " + 
					this.dataRegistro;}
			} catch (Exception e ) {
				throw new IllegalArgumentException("Erro." + e.getMessage());
			}
	}
	
	public String getTrabalho(Contrato contrato) {
		return 	this.getTipoDocumento() + " de trabalho " +
				this.getNomePessoa1() + " está contratado para o trabalho de servente, a partir da data: " + 
				this.getDataEmissao() + ".Testemunha 1 é: " + 
				this.nomeTestemunha1 + " Testemunha 2 é: " + 
				this.nomeTestemunha2 + ".Registro do documento em questão é: " + 
				this.getNumeroRegistro() + " Registrado no cartório: " +
				this.getNomeCartorio() + " Pelo Tabelião: " + 
				this.getNomeTabeliao() + " data de registro é: " + 
				this.dataRegistro;
}

	@Override
	public String getTipoDocumento() {
		return "Contrato";
	}

	@Override
	public int qtdRegistros() {
		return qtdContratos ++;
	}
}

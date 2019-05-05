package plataformalancamentofinanceiro.transference;

public class GerenciadorPessoaTransference {
	
	private Long codigo;
	
	private String nome;
	
	private String tipoPessoaEnumeration;
	
	private Boolean isFontePagamento;
	
	private Boolean isAtivo;
	
	private String observacao;
	
	public GerenciadorPessoaTransference() { }

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoPessoaEnumeration() {
		return tipoPessoaEnumeration;
	}

	public Boolean getIsFontePagamento() {
		return isFontePagamento;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoPessoaEnumeration(String tipoPessoaEnumeration) {
		this.tipoPessoaEnumeration = tipoPessoaEnumeration;
	}

	public void setIsFontePagamento(Boolean isFontePagamento) {
		this.isFontePagamento = isFontePagamento;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}

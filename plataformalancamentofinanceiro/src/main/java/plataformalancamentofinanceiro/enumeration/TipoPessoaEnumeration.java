package plataformalancamentofinanceiro.enumeration;

public enum TipoPessoaEnumeration {
	
	PESSOA_FISICA(1L, "Pessoa Física"),
	PESSOA_JURIDICA(2L, "Pessoa Jurídica"),
	PESSOA_SISTEMA(3L, "Pessoa Sistema"),
	PESSOA_AUTORIDADE(4L, "Pessoa Autoridade");
	
	private Long codigo;
	
	private String descricao;
	
	private TipoPessoaEnumeration(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

package plataformalancamentofinanceiro.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

@XmlRootElement
public class GerenciadorPessoaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private String nome;
	
	private TipoPessoaEnumeration tipoPessoaEnumeration;
	
	private Boolean isFontePagamento;
	
	private Boolean isAtivo;
	
	private String observacao;
	
	public GerenciadorPessoaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoaEnumeration getTipoPessoaEnumeration() {
		return tipoPessoaEnumeration;
	}

	public void setTipoPessoaEnumeration(TipoPessoaEnumeration tipoPessoaEnumeration) {
		this.tipoPessoaEnumeration = tipoPessoaEnumeration;
	}

	public Boolean getIsFontePagamento() {
		return isFontePagamento;
	}

	public void setIsFontePagamento(Boolean isFontePagamento) {
		this.isFontePagamento = isFontePagamento;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GerenciadorPessoaDomain other = (GerenciadorPessoaDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GerenciadorPessoaDomain [codigo=" + codigo + ", nome=" + nome + ", tipoPessoaEnumeration="
				+ tipoPessoaEnumeration + ", isFontePagamento=" + isFontePagamento + ", isAtivo=" + isAtivo
				+ ", observacao=" + observacao + "]";
	}
	
}

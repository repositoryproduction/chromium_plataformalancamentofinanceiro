package plataformalancamentofinanceiro.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

@Entity
@Table(name = "TB_PESSOA")
@XmlRootElement
public class GerenciadorPessoaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Column(name = "NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_PESSOA")
	private TipoPessoaEnumeration tipoPessoaEnumeration;
	
	@Column(name = "IS_FONTE_PAGAMENTO")
	private Boolean isFontePagamento;
	
	@Column(name = "IS_ATIVO")
	private Boolean isAtivo;
	
	@Column(name = "OBSERVACAO")
	private String observacao;
	
	public GerenciadorPessoaEntity() { }

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
		GerenciadorPessoaEntity other = (GerenciadorPessoaEntity) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GerenciadorPessoaEntity [codigo=" + codigo + ", nome=" + nome + ", tipoPessoaEnumeration="
				+ tipoPessoaEnumeration + ", isFontePagamento=" + isFontePagamento + ", isAtivo=" + isAtivo
				+ ", observacao=" + observacao + "]";
	}
	
}

package plataformalancamentofinanceiro.view;

import java.io.Serializable;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;

public class GerenciadorPessoaView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GerenciadorPessoaEntity gerenciadorPessoaEntity;
	
	public GerenciadorPessoaView() {
		gerenciadorPessoaEntity = new GerenciadorPessoaEntity();
	}

	public GerenciadorPessoaEntity getGerenciadorPessoaEntity() {
		return gerenciadorPessoaEntity;
	}

	public void setGerenciadorPessoaEntity(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		this.gerenciadorPessoaEntity = gerenciadorPessoaEntity;
	}
	
}

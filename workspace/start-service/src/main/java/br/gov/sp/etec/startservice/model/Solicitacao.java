package br.gov.sp.etec.startservice.model;

public class Solicitacao {
    
	private String nomeSolicitacao;
    private String tipoSolicitacao;
    
    
    public String getNomeSolicitacao() {
    	return this.nomeSolicitacao;
    }
    
    public void setNomeSolicitacao(String nomeSolicitacao) {
    this.nomeSolicitacao = nomeSolicitacao;
    }

	public String getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}
}

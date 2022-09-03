package br.gov.sp.etec.startservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolicitacaoController {
	//Aqui abrindo a index do sistema
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("abrir-solicitacao")
	public String abrirSolicitacao() {
		return "solicitacao";
	}
	

}

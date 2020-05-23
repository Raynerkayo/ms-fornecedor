package br.com.rayner.ms.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rayner.ms.fornecedor.model.InfoFornecedor;
import br.com.rayner.ms.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class MSFornecedorController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoService.getInfoPorEstado(estado);
	}
	
}

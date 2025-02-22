package br.com.apiteste01.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiteste01.domain.dtos.CriarPessoaRequestDto;
import br.com.apiteste01.domain.dtos.CriarPessoaResponseDto;
import br.com.apiteste01.domain.interfaces.PessoaDomainService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaDomainService pessoaDomainService;
	
	@PostMapping("criar")
	public ResponseEntity<CriarPessoaResponseDto> criar(@RequestBody @Valid CriarPessoaRequestDto dto){
		CriarPessoaResponseDto response = pessoaDomainService.criar(dto);
		return ResponseEntity.status(201).body(response);
	}

}

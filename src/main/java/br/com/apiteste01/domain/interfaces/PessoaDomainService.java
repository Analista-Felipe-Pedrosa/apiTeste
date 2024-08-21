package br.com.apiteste01.domain.interfaces;

import br.com.apiteste01.domain.dtos.CriarPessoaRequestDto;
import br.com.apiteste01.domain.dtos.CriarPessoaResponseDto;

public interface PessoaDomainService {
	
	CriarPessoaResponseDto criar(CriarPessoaRequestDto dto);

}

package br.com.apiteste01.domain.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiteste01.domain.dtos.CriarPessoaRequestDto;
import br.com.apiteste01.domain.dtos.CriarPessoaResponseDto;
import br.com.apiteste01.domain.entities.Pessoa;
import br.com.apiteste01.domain.interfaces.PessoaDomainService;
import br.com.apiteste01.infrastructure.repositories.PessoaRepository;

@Service
public class PessoaDomainServiceImp implements PessoaDomainService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CriarPessoaResponseDto criar(CriarPessoaRequestDto dto) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(dto.getNome());
		pessoa.setCpf(dto.getCpf());
		pessoa.setCargo(dto.getCargo());
		
		pessoaRepository.save(pessoa);
		
		CriarPessoaResponseDto response = modelMapper.map(pessoa, CriarPessoaResponseDto.class);
		
		return response;
		
	}

}

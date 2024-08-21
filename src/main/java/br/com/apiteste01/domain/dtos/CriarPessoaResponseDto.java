package br.com.apiteste01.domain.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class CriarPessoaResponseDto {
	private UUID id;
	private String nome;
	private String cargo;
	private String cpf;

}

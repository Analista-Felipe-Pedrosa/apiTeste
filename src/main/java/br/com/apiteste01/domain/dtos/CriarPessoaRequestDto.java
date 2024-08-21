package br.com.apiteste01.domain.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarPessoaRequestDto {
	
	@Size(min = 0, max = 100, message = "Informe um nome de 8 a 100 caracteres")
	@NotEmpty(message = "Por favor, informe o nome da pessoa")
	private String nome;
	
	@NotEmpty(message = "Por favor, informe um cargo")
	private String cargo;
	
	@NotEmpty(message = "Por favor, informe um CPF")
	private String cpf;

}

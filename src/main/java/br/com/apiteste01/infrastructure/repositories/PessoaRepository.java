package br.com.apiteste01.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.apiteste01.domain.entities.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, UUID> {

}

package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}

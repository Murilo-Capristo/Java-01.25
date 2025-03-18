package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Filial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilialRepository extends JpaRepository<Filial, Long> {
}

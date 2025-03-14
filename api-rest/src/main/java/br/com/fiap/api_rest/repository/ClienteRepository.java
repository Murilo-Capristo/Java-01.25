package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.enums.Categoria;
import br.com.fiap.api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);
    List<Cliente> findTop3ByIdade(int idade);
    
    List<Cliente> findByIdadeIs(int idade);
    List<Cliente> findByCategoriaEqualsIgnoreCase(Categoria categoria);
    List<Cliente> findByIdadeIsNot(int idade);
    List<Cliente> findByEmailIsNull();


    List<Cliente> findByNomeStartingWith(String prefix);
    List<Cliente> findByNomeEndingWith(String suffix);
    List<Cliente> findByNomeContaining(String infix);
    List<Cliente> findByNomeLike(String likePattern);


    List<Cliente> findByIdLessThan(long id);
    List<Cliente> findByIdLessThanEqual(long id);
    List<Cliente> findByIdGreaterThan(long id);
    List<Cliente> findByIdadeBetween(int min, int max);
    List<Cliente> findByNomeIn(Collection<String> nomes);

    List<Cliente> findByDataNascimentoBefore(Date dataNascimento);
    List<Cliente> findByDataNascimentoAfter(Date dataNascimento);
    List<Cliente> findByDataNascimentoBetwenn(Date dataNascimentoInicial, Date dataNascimentoFinal);

    List<Cliente> findByVipTrue();
    List<Cliente> findByVipFalse();

    List<Cliente> findByNomeOrEmail(String nome, String email);
    List<Cliente> findByNomeAndVipTrue(String nome);

    List<Cliente> findByNomeOrderByCpf(String nome);
    List<Cliente> findByNomeOrderByIdDesc(String nome);

    Cliente findByCpf(String cpf);

}

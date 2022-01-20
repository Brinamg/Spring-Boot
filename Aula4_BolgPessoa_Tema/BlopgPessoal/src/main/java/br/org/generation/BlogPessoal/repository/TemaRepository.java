package br.org.generation.BlogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.BlogPessoal.model.Tema;

@Repository
	public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByDescricaoContaningIgnoreCase(String descricao);


}

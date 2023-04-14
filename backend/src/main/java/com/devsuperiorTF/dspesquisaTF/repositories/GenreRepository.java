package com.devsuperiorTF.dspesquisaTF.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperiorTF.dspesquisaTF.entities.Genre;

// Operações de acesso a dados
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}

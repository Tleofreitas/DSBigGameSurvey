package com.devsuperiorTF.dspesquisaTF.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorTF.dspesquisaTF.entities.Genre;

// Operações de acesso a dados
public interface GenreRepository extends JpaRepository<Genre, Long>{

}

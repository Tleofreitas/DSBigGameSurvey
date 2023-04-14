package com.devsuperiorTF.dspesquisaTF.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorTF.dspesquisaTF.entities.Game;

// Operações de acesso a dados
public interface GameRepository extends JpaRepository<Game, Long>{

}

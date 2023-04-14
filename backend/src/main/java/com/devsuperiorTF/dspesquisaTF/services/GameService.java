package com.devsuperiorTF.dspesquisaTF.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperiorTF.dspesquisaTF.dto.GameDTO;
import com.devsuperiorTF.dspesquisaTF.entities.Game;
import com.devsuperiorTF.dspesquisaTF.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	// Buscar no Banco de Dados todos os games, guardar numa lista, transformar essa lista de games em uma lista de gamesDTO
	public List<GameDTO> findAll() {
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}

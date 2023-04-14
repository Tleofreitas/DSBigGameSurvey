package com.devsuperiorTF.dspesquisaTF.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperiorTF.dspesquisaTF.dto.GameDTO;
import com.devsuperiorTF.dspesquisaTF.services.GameService;

// Operações relacionadas a Games
@RestController
@RequestMapping(value = "/games")
public class GameResource {
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	}
}

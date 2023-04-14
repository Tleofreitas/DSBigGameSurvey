package com.devsuperiorTF.dspesquisaTF.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperiorTF.dspesquisaTF.dto.RecordDTO;
import com.devsuperiorTF.dspesquisaTF.dto.RecordInsertDTO;
import com.devsuperiorTF.dspesquisaTF.entities.Game;
import com.devsuperiorTF.dspesquisaTF.entities.Record;
import com.devsuperiorTF.dspesquisaTF.repositories.GameRepository;
import com.devsuperiorTF.dspesquisaTF.repositories.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;

	@Autowired // Instanciar o Game Completo para passar na inserção
	private GameRepository gameRepository;

	@Transactional
	// Inserir registro no banco de dados
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		repository.save(entity);

		return new RecordDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxnDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxnDate, pageRequest).map(x -> new RecordDTO(x));
	}
}

package com.devsuperiorTF.dspesquisaTF.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperiorTF.dspesquisaTF.entities.Record;

// Operações de acesso a dados
@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

	@Query("SELECT obj FROM Record obj WHERE "
			+ "(coalesce(:min IS NULL) OR obj.moment >= :min) AND "
			+ "(coalesce(:max IS NULL) OR obj.moment <= :max)")
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);

}

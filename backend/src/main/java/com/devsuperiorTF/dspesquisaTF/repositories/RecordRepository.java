package com.devsuperiorTF.dspesquisaTF.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorTF.dspesquisaTF.entities.Record;

// Operações de acesso a dados
public interface RecordRepository extends JpaRepository<Record, Long>{

}

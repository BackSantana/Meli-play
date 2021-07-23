package com.meli.demo.repository;

import com.meli.demo.entitys.TurnStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnStatusRepository extends JpaRepository<TurnStatus, Long> {
}

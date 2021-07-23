package com.meli.demo.repository;

import com.meli.demo.entitys.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}

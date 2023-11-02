package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {

}

package com.jec.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jec.api.entities.BoredArticle;

@Repository
public interface BoredArticleRepository extends JpaRepository<BoredArticle, Integer> {

}

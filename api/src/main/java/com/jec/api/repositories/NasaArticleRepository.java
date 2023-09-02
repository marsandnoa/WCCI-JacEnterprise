package com.jec.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jec.api.entities.NasaArticle;

@Repository
public interface NasaArticleRepository extends JpaRepository<NasaArticle, Integer> {

}

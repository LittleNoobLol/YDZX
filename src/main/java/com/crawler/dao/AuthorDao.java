package com.crawler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crawler.entity.TbAuthor;

public interface AuthorDao extends JpaRepository<TbAuthor, Integer> {

}

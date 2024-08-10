package com.practise.restfull.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.restfull.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}

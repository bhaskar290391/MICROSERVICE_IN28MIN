package com.practise.restfull.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.restfull.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

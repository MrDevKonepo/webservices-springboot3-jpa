package com.projeto.webservices.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.user;

public interface UserRepository extends JpaRepository<user, Long> {

}


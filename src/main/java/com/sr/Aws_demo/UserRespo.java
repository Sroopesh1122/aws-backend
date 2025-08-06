package com.sr.Aws_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespo extends JpaRepository<User, Integer> {

}

package com.wvsdev.demo.repositories;

import com.wvsdev.demo.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

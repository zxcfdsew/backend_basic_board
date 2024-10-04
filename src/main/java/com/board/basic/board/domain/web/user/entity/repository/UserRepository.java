package com.board.basic.board.domain.web.user.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.basic.board.domain.web.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

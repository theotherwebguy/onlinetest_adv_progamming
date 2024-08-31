package org.onlinetestsystem.onlinetest.repository;

import org.onlinetestsystem.onlinetest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    boolean existsByUsername(String username);
}

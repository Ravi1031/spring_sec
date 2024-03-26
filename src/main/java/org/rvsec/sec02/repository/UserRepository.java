package org.rvsec.sec02.repository;

import org.rvsec.sec02.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("""
    select u from User u where u.userName =:userName
    """)
    Optional<User> findByUserName(String userName);
}

package com.corderita.CRUD.Demo.data.repository;

import com.corderita.CRUD.Demo.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

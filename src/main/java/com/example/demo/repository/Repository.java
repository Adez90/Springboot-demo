package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<User, Long> {

    User findFirstByEmail(String email);

    User findFirstBySsn(int ssn);
}

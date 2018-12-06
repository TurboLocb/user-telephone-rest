package com.turbolocb.usertelephonerest.repositories;

import com.turbolocb.usertelephonerest.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
}

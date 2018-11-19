package com.turbolocb.usertelephonerest.services;

import com.turbolocb.usertelephonerest.entities.User;
import com.turbolocb.usertelephonerest.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    private UsersRepository usersRepository;

    @Autowired
    public void setUsersRepository(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User getUserById(Long id) {
        Optional<User> user = usersRepository.findById(id);
        if(!user.isPresent()) {
            System.out.printf("Пользователь с данным id" + id + "не найден");
        }
        return user.get();
    }

    public 

}

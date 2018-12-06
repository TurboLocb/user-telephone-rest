package com.turbolocb.usertelephonerest.controllers;

import com.turbolocb.usertelephonerest.entities.User;
import com.turbolocb.usertelephonerest.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class UserController {
    private UsersService usersService;

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return usersService.getUserById(userId);
    }

    @GetMapping("/users")
    public List<User> getUserById() {
        return usersService.getAllUsersList();
    }

    @PostMapping("/users")
    public User addUser (@RequestBody User theUser) {
        theUser.setId(0L);
        theUser = usersService.saveOrUpdate(theUser);
        return theUser;
    }

    @PutMapping("/users")
    public User updateStudent(@RequestBody User theUser) {
        theUser = usersService.saveOrUpdate(theUser);
        return theUser;
    }

    @DeleteMapping("/user/{userId}")
    public int deleteUser(@PathVariable Long userId) {
        usersService.delete(userId);
        return HttpStatus.OK.value();
    }

}

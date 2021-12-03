package com.example.demo.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(val service: UserService) {
    @GetMapping("/")
    fun getAll(): MutableIterable<User> {
        return service.findAll()
    }

}
package com.example.demo.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService(val db: UserRepository) {
    fun findAll(): MutableIterable<User> = db.findAll()

}
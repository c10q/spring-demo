package com.example.demo.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
class UserService(val db: UserRepository) {
    fun findAll(): MutableIterable<User> = db.findAll()

    fun findById(id: Long): Optional<User> = db.findById(id)

    fun post(user: User): User = db.save(user)

    fun delete(id: Long) = db.deleteById(id)

    fun update(user: User): User {
        return db.save(user)
    }

}
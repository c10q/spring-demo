package com.example.demo.user

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/users")
class UserController(val service: UserService) {
    @GetMapping("/")
    fun getAll(): MutableIterable<User> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): Optional<User> {
        return service.findById(id)
    }

    @PostMapping
    fun post(@RequestBody user: User): User {
        return service.post(user)
    }

    @PutMapping("/{id}")
    fun put(@PathVariable id: Long, @RequestBody user: User): User {
        val entity: User = getUserById(id).get()
        if (user.name.isNotEmpty())
            entity.name = user.name
        if (user.gender != 0)
            entity.gender = user.gender
        return service.update(entity)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }

}
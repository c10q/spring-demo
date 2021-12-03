package com.example.demo.user

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    val id: Long?,
    val name: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime
)
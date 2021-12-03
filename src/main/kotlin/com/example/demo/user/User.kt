package com.example.demo.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")

data class User(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        var name: String,
        var gender: Int,
        @Column(name = "created_at") @CreationTimestamp
        val createdAt: LocalDateTime? = null
)
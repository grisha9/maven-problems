package com.example.springkotlin

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "test")
class TestEntity {
    @Id
    var id: Long? = null
}
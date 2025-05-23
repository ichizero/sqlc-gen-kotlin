// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.29.0

package com.example.authors.mysql

import java.sql.Connection
import java.sql.SQLException
import java.sql.Statement

interface Queries {
  @Throws(SQLException::class)
  fun createAuthor(name: String, bio: String?): Long
  
  @Throws(SQLException::class)
  fun deleteAuthor(id: Long)
  
  @Throws(SQLException::class)
  fun getAuthor(id: Long): Author?
  
  @Throws(SQLException::class)
  fun listAuthors(): List<Author>
  
}


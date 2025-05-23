// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.29.0

package com.example.booktest.mysql

import java.sql.Connection
import java.sql.SQLException
import java.sql.Statement
import java.time.LocalDateTime

interface Queries {
  @Throws(SQLException::class)
  fun booksByTags(tags: String): List<BooksByTagsRow>
  
  @Throws(SQLException::class)
  fun booksByTitleYear(title: String, yr: Int): List<Book>
  
  @Throws(SQLException::class)
  fun createAuthor(name: String): Long
  
  @Throws(SQLException::class)
  fun createBook(
      authorId: Int,
      isbn: String,
      bookType: BooksBookType,
      title: String,
      yr: Int,
      available: LocalDateTime,
      tags: String): Long
  
  @Throws(SQLException::class)
  fun deleteAuthorBeforeYear(yr: Int, authorId: Int)
  
  @Throws(SQLException::class)
  fun deleteBook(bookId: Int)
  
  @Throws(SQLException::class)
  fun getAuthor(authorId: Int): Author?
  
  @Throws(SQLException::class)
  fun getBook(bookId: Int): Book?
  
  @Throws(SQLException::class)
  fun updateBook(
      title: String,
      tags: String,
      bookId: Int)
  
  @Throws(SQLException::class)
  fun updateBookISBN(
      title: String,
      tags: String,
      isbn: String,
      bookId: Int)
  
}


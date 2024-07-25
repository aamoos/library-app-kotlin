package com.group.libraryapp.domain.book

import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional
//test
interface BookRepository : JpaRepository<Book, Long> {

    fun findByName(bookName: String): Book?

}
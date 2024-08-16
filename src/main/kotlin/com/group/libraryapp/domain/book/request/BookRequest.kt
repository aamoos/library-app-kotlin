package com.group.libraryapp.domain.book.request

import com.group.libraryapp.domain.book.BookType

class BookRequest(
    val name: String,
    val type: BookType,
) {
}
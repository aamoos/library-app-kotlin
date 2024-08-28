package com.group.libraryapp.dto.user.request

data class UserCreateRequest(
    var name: String,
    val age: Int?,
) {
}
package com.group.libraryapp.service.temp

import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.service.user.UserService
import com.group.libraryapp.util.TxHelper
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TempTest @Autowired constructor(
    private val userService: UserService,
    private val userRepository: UserRepository,
    private val txHelper: TxHelper,
) {

    @Test
    fun `유저 1명과 책 2권을 저장하고 대출한다`(){
        //when
        userService.saveUserAndLoanTwoBooks()

        //then
        txHelper.exec {
            val users = userRepository.findAll()
            assertThat(users).hasSize(1);
            assertThat(users[9].userLoanHistories).hasSize(2)
        }
    }

}
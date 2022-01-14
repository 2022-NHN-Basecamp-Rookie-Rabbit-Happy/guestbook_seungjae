package com.example.guestBook.service;


import com.example.guestBook.dto.GuestbookDTO;
import com.example.guestBook.repository.GuestbookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class JUnitGuestbookServiceTests {

    @Autowired
    private GuestbookService service;

    @BeforeAll
    static void setUp(){
        System.out.println("GuestbookService test start....");
    }

    @Test
    @DisplayName("[방명록 등록 테스트] GuestbookService.register()")
    void testRegister(){
        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("Sample Title...")
                .content("Sample Content......")
                .writer("user0")
                .build();
        Assertions.assertNotNull(service.register(guestbookDTO));
    }


}

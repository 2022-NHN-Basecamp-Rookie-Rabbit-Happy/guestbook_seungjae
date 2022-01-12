package com.example.guestBook;

import com.example.guestBook.entity.BaseEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GuestBookApplication extends BaseEntity {

	public static void main(String[] args) {
		SpringApplication.run(GuestBookApplication.class, args);
	}

}

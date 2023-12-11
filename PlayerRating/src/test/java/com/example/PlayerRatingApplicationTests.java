package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entities.PlayerRating;
import com.example.validation.BasicValidation;

@SpringBootTest
class PlayerRatingApplicationTests {

	PlayerRating st = new PlayerRating(1L, 9, "Ali", 20, "3");
	
	BasicValidation validator = new BasicValidation();

	@Test
	void contextLoads() {
	}

	@Test
	void checkAge() {

		
		Boolean flag = validator.isValidAge(st);
		assertThat(flag).isTrue();

	}
	
	@Test
	void checkScore() {

		
		Boolean flag = validator.isValidScore(st);
		assertThat(flag).isTrue();

	}
	
	@Test
	void checkMatchesPlay() {

		
		Boolean flag = validator.isValidMatchesPlay(st);
		assertThat(flag).isTrue();
		

	}
}



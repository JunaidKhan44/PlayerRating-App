/**
 * 
 */
package com.example.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entities.PlayerRating;

/**
 * @author hp
 *
 */

@SpringBootTest 
public class PlayerRatingRepositoryTest {
	
	@Autowired
	private PlayerRatingRepository  repository;
	
	@Test
	void isPlayerRatingExistById() {
		
		PlayerRating st = new PlayerRating(1L,20,"Ali",20,"3");
		
		repository.save(st);
		
		Boolean  res= repository.isPlayerRatingExistById(st.getPlayerRatingId());
		
		assertThat(res).isTrue();
		
	}

	
	@Test
	void isValidScore() {
		
		PlayerRating st = new PlayerRating(1L,20,"Ali",20,"3");
		
		repository.save(st);
		
		Boolean  res= repository.isPlayerRatingExistById(st.getPlayerRatingId());
		
		assertThat(res).isTrue();
		
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("------------down");
		repository.deleteAll();
	}
	
	
	@BeforeEach
	void setup() {
		System.out.println("------------up");
	}
	
}

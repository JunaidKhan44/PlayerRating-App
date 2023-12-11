/**
 * 
 */
package com.example.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.dao.PlayerRatingRepository;
import com.example.serviceImpl.PlayerRatingServiceImpl;

/**
 * @author hp
 *
 */

@ExtendWith(MockitoExtension.class) 
public class PlayerRatingServiceTest {

	@Mock  
	private PlayerRatingRepository repository;
	
	
	private PlayerRatingServiceImpl service;

	@BeforeEach
	void setUp() {
		this.service= new PlayerRatingServiceImpl(this.repository);
	}

	@Test
	void getAllStudent() {

		service.getAllPlayers();
		verify(repository).findAll();
		
	}
	
}

/**
 * 
 */
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PlayerRatingDto;
import com.example.serviceImpl.PlayerRatingServiceImpl;

/**
 * @author Junaid Khan
 *
 */

@RestController
public class HomeController {

	@Autowired
	private PlayerRatingServiceImpl playerRatingService;

	@GetMapping("/all")
	public List<PlayerRatingDto> getAllPlayer() {

		return playerRatingService.getAllPlayers();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PlayerRatingDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(playerRatingService.findById(id));

	}

	@PostMapping("/addRating")
	public ResponseEntity<String> addRating(@RequestBody PlayerRatingDto dto) {
		playerRatingService.addPlayerRating(dto);
		return new ResponseEntity<>("Record Add Successfully...!", HttpStatus.OK);
	
	}

	@DeleteMapping("deleteRating/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		playerRatingService.deletePlayerRating(id);
		return new ResponseEntity<>("Record Deleted Successfully...!", HttpStatus.OK);
	}

	@PutMapping("update/{id}")
	public ResponseEntity<String> updateMatch(@PathVariable Long id, @RequestBody PlayerRatingDto dto) {
		 Boolean flag=playerRatingService.updatePlayerRating(id, dto);
		 if(flag) {
				return new ResponseEntity<>("Record Updated Successfully...!", HttpStatus.OK);
		 }
		 else {
				return new ResponseEntity<>("Unable to update Record...!", HttpStatus.BAD_REQUEST);
		 }

	}
}

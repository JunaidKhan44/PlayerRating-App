/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.dto.PlayerRatingDto;

/**
 * @author Junaid Khan
 *
 */
public interface PlayerRatingService {

	public PlayerRatingDto addPlayerRating(PlayerRatingDto obj);

	public Boolean updatePlayerRating(Long id, PlayerRatingDto dto);

	public void deletePlayerRating(Long id);

	public List<PlayerRatingDto> getAllPlayers();

	public PlayerRatingDto findById(Long id);

}

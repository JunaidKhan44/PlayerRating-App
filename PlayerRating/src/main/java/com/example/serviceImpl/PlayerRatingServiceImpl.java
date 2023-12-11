/**
 * 
 */
package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.config.PlayerConfiguration;
import com.example.dao.PlayerRatingRepository;
import com.example.dto.PlayerRatingDto;
import com.example.entities.PlayerRating;
import com.example.service.PlayerRatingService;
import com.example.util.Message;

/**
 * @author Junaid Khan
 *
 */

@Service
public class PlayerRatingServiceImpl implements PlayerRatingService {

	@Autowired
	private PlayerRatingRepository repository;

	@Autowired
	private PlayerConfiguration configuration;

	public PlayerRatingServiceImpl(PlayerRatingRepository repository) {
		this.repository = repository;
	}

	@Override
	public PlayerRatingDto addPlayerRating(PlayerRatingDto obj) {
		PlayerRating entity = configuration.modelMapper().map(obj, PlayerRating.class);
		return configuration.modelMapper().map(repository.save(entity), PlayerRatingDto.class);
	}

	@Override
	public Boolean updatePlayerRating(Long id, PlayerRatingDto dto) {
		Optional<PlayerRating> obj = repository.findById(id);
		if (obj.isPresent()) {
			PlayerRating entity = new PlayerRating(obj.get().getPlayerRatingId(), dto.getAge(), dto.getPlayerName(),
					dto.getHigherScore(), dto.getMatchesPlay());
			repository.save(entity);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void deletePlayerRating(Long id) {
		try {
			repository.deleteById(id);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public List<PlayerRatingDto> getAllPlayers() {

		List<PlayerRating> list = repository.findAll();
		List<PlayerRatingDto> matchesDtoList = new ArrayList<>();
		list.forEach((obj) -> matchesDtoList.add(configuration.modelMapper().map(obj, PlayerRatingDto.class)));

		return matchesDtoList;
	}

	@Override
	public PlayerRatingDto findById(Long id) {
		Optional<PlayerRating> obj = repository.findById(id);
		if (obj.isPresent()) {
			return configuration.modelMapper().map(obj, PlayerRatingDto.class);
		}
		return null;

	}

}

/**
 * 
 */
package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.PlayerRating;

/**
 * @author Junaid Khan
 *
 */

public interface PlayerRatingRepository extends JpaRepository<PlayerRating, Long>{
	
	@Query("SELECT CASE WHEN COUNT(rt) > 0 THEN TRUE ELSE FALSE END FROM PlayerRating rt WHERE rt.playerRatingId = :id")
	Boolean isPlayerRatingExistById(Long id);
}

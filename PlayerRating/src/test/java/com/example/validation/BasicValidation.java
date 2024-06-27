/**
 * 
 */
package com.example.validation;

import com.example.entities.PlayerRating;

/**
 * @author hp
 *
 */

public class BasicValidation {
	
	public Boolean isValidScore(PlayerRating obj) {
		if(obj.getHigherScore()<0) {
			return false;
		}
		return true;
	}
	
	public Boolean isValidAge(PlayerRating obj) {
		if(obj.getAge()<0) {
			return false;
		}
		return true;
	}
	
	public Boolean isValidMatchesPlay(PlayerRating obj) {
		if(obj.getMatchesPlay()==null) {
			return false;
		}
		return true;
	}
}

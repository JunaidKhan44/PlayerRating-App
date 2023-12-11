/**
 * 
 */
package com.example.dto;

/**
 * @author Junaid Khan
 *
 */

public class PlayerRatingDto {

	private Long playerRatingId;
	private Integer age;
	private String playerName;
	private Integer higherScore;
	private String matchesPlay;
	
	public PlayerRatingDto() {
		super();
	}
	
	public PlayerRatingDto(Long playerRatingId, Integer age, String playerName, Integer higherScore,
			String matchesPlay) {
		super();
		this.playerRatingId = playerRatingId;
		this.age = age;
		this.playerName = playerName;
		this.higherScore = higherScore;
		this.matchesPlay = matchesPlay;
	}

	public Long getPlayerRatingId() {
		return playerRatingId;
	}
	public void setPlayerRatingId(Long playerRatingId) {
		this.playerRatingId = playerRatingId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getHigherScore() {
		return higherScore;
	}
	public void setHigherScore(Integer higherScore) {
		this.higherScore = higherScore;
	}
	public String getMatchesPlay() {
		return matchesPlay;
	}
	public void setMatchesPlay(String matchesPlay) {
		this.matchesPlay = matchesPlay;
	}
	
		
	
	
}

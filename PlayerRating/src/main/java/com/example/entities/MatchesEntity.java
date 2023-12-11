package com.example.entities;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Set;

import javax.persistence.JoinColumn;

/**
 * @author Junaid Khan
 *
 */


@Entity
@Table(name = "Matches")
public class MatchesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long matchId;
	private Long startTime;
	private Long endTime;
	private String matchName;

	@ManyToMany
	@JoinTable(name = "match_by_team", joinColumns = { @JoinColumn(name = "matchId") }, inverseJoinColumns = {
			@JoinColumn(name = "teamId") })
	private Set<Team> teamLov;


	public MatchesEntity() {
		super();

	}

//	public MatchesEntity(Long matchId, Long startTime, Long endTime, String matchName, List<TeamsEntity> teamLov) {
//		super();
//		this.matchId = matchId;
//		this.startTime = startTime;
//		this.endTime = endTime;
//		this.matchName = matchName;
//		this.teamLov = teamLov;
//	}
//
//	public Long getMatchId() {
//		return matchId;
//	}
//
//	public void setMatchId(Long matchId) {
//		this.matchId = matchId;
//	}
//
//	public Long getStartTime() {
//		return startTime;
//	}
//
//	public void setStartTime(Long startTime) {
//		this.startTime = startTime;
//	}
//
//	public Long getEndTime() {
//		return endTime;
//	}
//
//	public void setEndTime(Long endTime) {
//		this.endTime = endTime;
//	}
//
//	public String getMatchName() {
//		return matchName;
//	}
//
//	public void setMatchName(String matchName) {
//		this.matchName = matchName;
//	}
//
//	public List<TeamsEntity> getTeamLov() {
//		return teamLov;
//	}
//
//	public void setTeamLov(List<TeamsEntity> teamLov) {
//		this.teamLov = teamLov;
//	}

}

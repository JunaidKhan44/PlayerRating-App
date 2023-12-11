/**
 * 
 */
package com.example.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Junaid Khan
 *
 */
@Entity
@Table(name = "Team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teamId;
	private String teamName;

	
	@ManyToMany(mappedBy = "teamLov",cascade = { CascadeType.ALL })
	private Set<MatchesEntity> matchLov;
	
}

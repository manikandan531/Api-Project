package com.college.staffDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Achievement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer achieveId;
	private String eventName;
	private String eventPlace;
	
	public Integer getAchieveId() {
		return achieveId;
	}
	public void setAchieveId(Integer achieveId) {
		this.achieveId = achieveId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventPlace() {
		return eventPlace;
	}
	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}
	public Achievement(Integer achieveId, String eventName, String eventPlace) {
		super();
		this.achieveId = achieveId;
		this.eventName = eventName;
		this.eventPlace = eventPlace;
	}
	public Achievement() {
		super();
	}

}

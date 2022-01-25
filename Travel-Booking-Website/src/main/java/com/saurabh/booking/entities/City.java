package com.saurabh.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cityid;
	@Column
	private String cityfrom;
	@Column
	private String tocity;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityfrom() {
		return cityfrom;
	}
	public void setCityfrom(String cityfrom) {
		this.cityfrom = cityfrom;
	}
	public String getTocity() {
		return tocity;
	}
	public void setTocity(String tocity) {
		this.tocity = tocity;
	}
	public City(int cityid, String cityfrom, String tocity) {
		this.cityid = cityid;
		this.cityfrom = cityfrom;
		this.tocity = tocity;
	}
	public City() {
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityfrom=" + cityfrom + ", tocity=" + tocity + "]";
	}
	
	

}

package com.saurabh.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train")
public class Train {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int train_number;
	@Column
	private String train_name;
	@Column
	private String start_time;
	@Column
	private String end_time;
	@Column
	private int total_seats;
	@Column
	private int cityid;
	public int getTrain_number() {
		return train_number;
	}
	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public Train(int train_number, String train_name, String start_time, String end_time, int total_seats, int cityid) {
		this.train_number = train_number;
		this.train_name = train_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.total_seats = total_seats;
		this.cityid = cityid;
	}
	public Train() {
	}
	@Override
	public String toString() {
		return "Train [train_number=" + train_number + ", train_name=" + train_name + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", total_seats=" + total_seats + ", cityid=" + cityid + "]";
	}
	
	

}

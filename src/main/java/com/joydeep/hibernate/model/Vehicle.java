package com.joydeep.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	 @ManyToMany(mappedBy="vehicle")
	private Collection<UserDetails> userList=new ArrayList<UserDetails>();

	public Vehicle() {
	}

	public Vehicle(int vehicleId, String vehicleName, Collection<UserDetails> userList) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.userList = userList;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Collection<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", userList=" + userList + "]";
	}

	

	

}

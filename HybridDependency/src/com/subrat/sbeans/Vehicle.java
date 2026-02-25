package com.subrat.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle { 
     private String vehicleName;
     private Engine engine;
     private Tyre tyre;
     
	 public Vehicle(Engine engine) {
		super();
		this.engine = engine;		
	 }
     @Autowired
	 public void setTyre(Tyre tyre) {
		 this.tyre = tyre;
	 }
   
	 public void setVehicleName(String vehicleName) {
		 this.vehicleName = vehicleName;
	 }
	 public String displayVehicleInfo() {
		 return ""+this.vehicleName;	 
		 }
     
}

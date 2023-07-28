package com.form.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//import javax.persistence.Entity;
//
@Entity(name="Student")
public class Student {
	
		private int id;
		private String firstName;
		private String lastName;
		private String streetAddress;
		private String city;
		private String state;
		private String zip;
		private String phone;
		private String email;
		private String date;
		private String favourite;
		private String interest;
		private String likelihood;
		private String raffle;
		private String comments;
		
		
		
		public Student(int id, String firstName, String lastName, String streetAddress, String city, String state, String phone,
				String zip, String email, String date,String likelihood,String[] favourite,String interest, int raffle,String comments ) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.phone = phone;
			this.zip = zip;
			this.email = email;
			this.date = date;
		}
	
		public Student() {
			// TODO Auto-generated constructor stub
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
		public String getStreetAddress() {
			return streetAddress;
		}
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
	
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setDate(String date) {
			this.date = date;
		}
		public String getDate() {
			return date;
		}
		
		public String getFavourite() {
			return favourite;
		}
		public void setFavourite(String favourite) {
			this.favourite = favourite;
		}
		
		public void setInterest(String interest) {
			this.interest = interest;
		}
		public String getInterest() {
			return interest;
		}
		
		public void setLikelihood(String likelihood) {
			this.likelihood = likelihood;
		}
		public String getLikelihood() {
			return likelihood;
		}
	
		public void setRaffle(String raffle) {
			this.raffle = raffle;
		}
		public String getRaffle() {
			return raffle;
		}
		
		public void setComments(String comments) {
			this.comments = comments;
		}
		public String getComments() {
			return comments;
		}

}

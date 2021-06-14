package com.airlines.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {

	@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int passengerId;
		private String firstName;
		private String lastName;
		//private int noOfPassengers;//doubt
		private String emailId;
		private int age;
		private String gender;
		
		
		
		@ManyToOne(cascade = {CascadeType.PERSIST})
		@JoinColumn(name = "userId")
		private User user;
		public Passenger() {
			// TODO Auto-generated constructor stub
		}

		

		public int getPassengerId() {
			return passengerId;
		}

		public void setPassengerId(int passengerId) {
			this.passengerId = passengerId;
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

		/*public int getNoOfPassengers() {
			return noOfPassengers;
		}

		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}*/

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public String getGender() {
			return gender;
		}



		public void setGender(String gender) {
			this.gender = gender;
		}



		public Passenger(int passengerId, String firstName, String lastName, String emailId, int age, String gender,
				User user) {
			super();
			this.passengerId = passengerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.age = age;
			this.gender = gender;
			this.user = user;
		}
		
	

}

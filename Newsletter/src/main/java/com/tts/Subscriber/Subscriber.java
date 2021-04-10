package com.tts.Subscriber;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Subscriber {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		private String Email;
		private String firstName;
		private String lastName;
		
		public Subscriber() {}

		public Subscriber(String email, String firstName, String lastName) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Subscriber [email=" + Email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			this.Email = email;
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

		public Object getSignedUp() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}




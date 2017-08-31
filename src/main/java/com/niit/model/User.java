 package com.niit.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
                                 import javax.persistence.Id;
	import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

	@Entity
	@Table(name = "user")
	public class User {
		@Id
		@GeneratedValue (strategy=GenerationType.AUTO) 
		private int id;
		@NotEmpty
		private String username;
		@NotEmpty
		@Email
		private String email;
		@NotEmpty
		private String password;  
		@NotEmpty
		private String address;
		private boolean enabled;
		private String role;
		
		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		
		public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
		}

		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

	}



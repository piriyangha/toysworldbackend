 package com.niit.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
                                 import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "user")
	public class User {
		@Id
		@GeneratedValue (strategy=GenerationType.AUTO) 
		private int id;
		private String username;
		private String email;
		private String password;                                  
		private String address;
		private boolean enabled;
		private String roll;
		
		public String getEmail() {
			return email;
		}

		public void setEmailid(String email) {
			this.email = email;
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



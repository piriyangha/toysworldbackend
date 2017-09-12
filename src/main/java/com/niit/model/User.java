 package com.niit.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
                                 import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


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
		private String phone;
		private boolean enabled;
		private String role;
		@OneToOne
		private Cart cart;
		
		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

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


		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
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



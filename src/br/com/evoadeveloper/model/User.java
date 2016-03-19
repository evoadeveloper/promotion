package br.com.evoadeveloper.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@Column(name = "user_email", nullable = false, unique = true, length = 50)
	private String email;
	@OneToMany(mappedBy = "user", targetEntity = Promotion.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Promotion> promotions;

	public User() {
		super();
	}

	public User(String email, List<Promotion> promotions) {
		super();
		this.email = email;
		this.promotions = promotions;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

}

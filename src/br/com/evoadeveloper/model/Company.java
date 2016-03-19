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
@Table(name = "tb_company")
public class Company {

	@Id
	@Column(name = "company_email", nullable = false, unique = true, length = 50)
	private String email;
	@Column(name = "company_name", nullable = false, length = 50)
	private String name;
	@Column(name = "company_telephone", nullable = true, length = 12)
	private String telephone;
	@Column(name = "company_name", nullable = false, length = 200)
	private String location;
	@OneToMany(mappedBy = "company", targetEntity = Promotion.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Promotion> promotions;

	public Company() {
		super();
	}

	public Company(String email, String name, String telephone, String location, List<Promotion> promotions) {
		super();
		this.email = email;
		this.name = name;
		this.telephone = telephone;
		this.location = location;
		this.promotions = promotions;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

}

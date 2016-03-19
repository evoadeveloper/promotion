package br.com.evoadeveloper.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_promotion")
public class Promotion {

	@Id
	@Column(name = "promotion_name", nullable = false, unique = true, length = 50)
	private String name;
	@Column(name = "promotion_description", nullable = false, length = 200)
	private String description;
	@Column(name = "promotion_initial_date", nullable = false, length = 10)
	private Date initialDate;
	@Column(name = "promotion_final_date", nullable = false, length = 10)
	private Date finalDate;
	@ManyToOne
	@JoinColumn(name = "company_promotion")
	private Company company;
	@ManyToOne
	@JoinColumn(name = "user_promotion")
	private User user;

	public Promotion() {
		super();
	}

	public Promotion(String name, String description, Date initialDate, Date finalDate, Company company, User user) {
		super();
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.company = company;
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

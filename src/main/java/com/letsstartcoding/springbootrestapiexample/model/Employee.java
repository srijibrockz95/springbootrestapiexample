package com.letsstartcoding.springbootrestapiexample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String designation;
	
	@NotBlank
	private String expertise;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date createAt;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the expertise
	 */
	public String getExpertise() {
		return expertise;
	}

	/**
	 * @param expertise the expertise to set
	 */
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}

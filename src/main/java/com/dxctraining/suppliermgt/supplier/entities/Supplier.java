package com.dxctraining.suppliermgt.supplier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier details")
public class Supplier {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String password;


	public Supplier() {
	}

	public Supplier(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Supplier that = (Supplier) obj;
		return this.id == that.id;
	}
}

/**
 * 
 */
package com.ss.basics.day.three;

import java.io.Serializable;

/**
 * @author Hassankh
 *
 */
public class Person implements Serializable{

	private static final long serialVersionUID = 422221921888677708L;
	
	private Integer empId;
	private String name;
	
	public Person(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}
	
	
}

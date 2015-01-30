package com.cxf.pojo;

public class Human {
	
	private String name;
	private String sex;
	private int age;
	
	

	public Human() {
		super();
		
	}
	
	public Human(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	
	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	
	

}

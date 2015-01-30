package com.cxf.pojo;

public class Person extends Human {
	
	private String uid;

	public Person(String uid) {
		super();
		this.uid = uid;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [uid=" + uid + "]";
	}
	
	
	

}

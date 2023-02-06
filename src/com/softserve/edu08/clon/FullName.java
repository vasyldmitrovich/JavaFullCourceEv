package com.softserve.edu08.clon;

public class FullName implements Cloneable {
	private String firstName;
	private String lastName;

	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FullName [ firstName = " + firstName + ", lastName=" + lastName + " ]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		//FullName myClone = (FullName) super.clone();
		//myClone.setFirstName(new String(firstName));
		//myClone.setLastName(lastName.substring(0));
	}
}

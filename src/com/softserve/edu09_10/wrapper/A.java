package com.softserve.edu09_10.wrapper;

import java.io.Serializable;

public class A { //implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "A [getClass()=" + getClass()
			+ ", hashCode()=" + hashCode()
			+ ", toString()" + "]";
	}

}
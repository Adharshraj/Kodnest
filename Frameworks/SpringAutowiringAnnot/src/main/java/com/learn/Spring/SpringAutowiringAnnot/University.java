package com.learn.Spring.SpringAutowiringAnnot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
	@Autowired
	@Qualifier("Pr3")
	Professor prof;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(Professor prof) {
		super();
		this.prof = prof;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "University [prof=" + prof + "]";
	}
	
}

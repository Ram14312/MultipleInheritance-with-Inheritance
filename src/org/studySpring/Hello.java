package org.studySpring;

import org.studySpring.Person.NonVegan;
import org.studySpring.Person.Person;

public class Hello {

	public static void main(String[] args) {
		 Person john = new NonVegan();
		 john.breathe();
		 john.message();
		 john.eat();

	}

}

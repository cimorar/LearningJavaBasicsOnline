package rci.tutorial.classes;

import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
	public Sex getGender() {
		return this.gender;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
     

}

package rci.tutorial.classes;



import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

	public static void main(String[] args) {
		ArrayList<Person> roster;
		Person p1 = new Person();
		Person p2 = new Person();
		
		roster = new ArrayList<Person>();
		
		processPersonsWithFunction(
			    roster,
			    p -> p.getGender() == Person.Sex.MALE
			        && p.getAge() >= 18
			        && p.getAge() <= 25,
			    p -> p.getEmailAddress(),
			    email -> System.out.println(email)
			);
	
				

	}
	
	public static void processPersonsWithFunction(ArrayList<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block)
	{
		for (Person p : roster) {
		    if (tester.test(p)) {
		       String data = mapper.apply(p);
		       block.accept(data);
		    }
		}
	}	

	
	

}

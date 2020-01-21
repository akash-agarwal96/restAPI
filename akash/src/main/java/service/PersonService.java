package service;


import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Person;

@Service
public class PersonService {
	Hashtable<String,Person> persons = new Hashtable<String,Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setName("Akash Agarwal");
		p.setMobile_number(9654624232L);
		p.setAddress("New Delhi");
		p.setCollege_name("VIT");
		p.setSkills("Web development,Java,ML");
		p.setCourse("Java");
		persons.put("1",p);

		p = new Person();
		p.setId("2");
		p.setName("Amit Sharma");
		p.setMobile_number(8876542392L);
		p.setAddress("Bhopal");
		p.setCollege_name("NIT");
		p.setSkills("C++,Python");
		p.setCourse("Python");
		persons.put("2",p);
		
		p = new Person();
		p.setId("3");
		p.setName("Rohan Rach");
		p.setMobile_number(8762537282L);
		p.setAddress("Chandigarh");
		p.setCollege_name("DTU");
		p.setSkills("JavaScript,Designing");
		p.setCourse("React.js");
		persons.put("3",p);
		
		p = new Person();
		p.setId("4");
		p.setName("Kishan Garg");
		p.setMobile_number(9752749861L);
		p.setAddress("Mumbai");
		p.setCollege_name("IIT");
		p.setSkills("Python,ML,SQL");
		p.setCourse("Machine Learning");
		persons.put("4",p);
		
		
	}
	public Person getPerson(String id) {
		if(persons.containsKey(id)) 
			return persons.get(id);
		else
			
			return null;
	}
	
	public Hashtable<String,Person> getAll() {
	
		return persons;
	}
}
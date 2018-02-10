package pl.coderslab.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="animals")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String race;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private int age;
	
	private String health;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public Animal(int id, String race, String name, String gender, int age, String health) {
		super();
		this.id = id;
		this.race = race;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.health = health;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", race=" + race + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", health=" + health + "]";
	}
	
}

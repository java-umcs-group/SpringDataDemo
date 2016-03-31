package pl.skni.javaumcsgroup;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by kuba on 31.03.16.
 */
@Entity
@Data
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "salary")
	private int salary;

	public Employee() {
	}

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", salary=" + salary +
				'}';
	}
}

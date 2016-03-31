package pl.skni.javaumcsgroup;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kuba on 31.03.16.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByFirstNameOrLastName(String firstName, String lastName);
}

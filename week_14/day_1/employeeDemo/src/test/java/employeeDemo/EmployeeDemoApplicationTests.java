package employeeDemo;

import employeeDemo.models.Employee;
import employeeDemo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeDemoApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveAnEmployee() {
		Employee myEmployee = new Employee("Dave", 34, 324673258, "dave@mycompany.com");
		employeeRepo.save(myEmployee);
	}
}

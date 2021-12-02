package itsystem.demo.Repository;

import itsystem.demo.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}

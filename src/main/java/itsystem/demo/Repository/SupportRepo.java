package itsystem.demo.Repository;

import itsystem.demo.Model.Employee;
import itsystem.demo.Model.Support;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepo extends CrudRepository <Support, Long>{
}

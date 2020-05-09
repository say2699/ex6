package repository;

import kz.iitu.projects.ex6.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmplRepository extends CrudRepository <Employees, Long> {
    List<Employees> findByTitleContaining(String name);

    List<Employees> findByID(int i);
}

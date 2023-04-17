package petrov.springboot.spring_boot.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import petrov.springboot.spring_boot.entity.User;

import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext()
    private EntityManager entityManager;

    @Override
    public List<User> getAllEmployees() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveEmployee(User employee) {
        if(employee.getId() == 0) {
            entityManager.persist(employee);
        } else {
            entityManager.merge(employee);
        }
        entityManager.close();
    }

    @Override
    public User getEmployee(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}

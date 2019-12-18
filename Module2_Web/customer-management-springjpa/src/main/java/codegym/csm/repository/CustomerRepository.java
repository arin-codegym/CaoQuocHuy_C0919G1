package codegym.csm.repository;

import codegym.csm.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
public interface CustomerRepository extends Repository<Customer> {

}
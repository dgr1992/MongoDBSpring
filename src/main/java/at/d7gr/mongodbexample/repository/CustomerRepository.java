package at.d7gr.mongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import at.d7gr.mongodbexample.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}

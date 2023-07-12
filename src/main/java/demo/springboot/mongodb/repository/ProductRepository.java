package demo.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import demo.springboot.mongodb.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{

}

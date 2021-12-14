package co.usa.reto2.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.usa.reto2.model.Products;

public interface ProductsCrudRepository extends MongoRepository<Products, String>{
    
    
}

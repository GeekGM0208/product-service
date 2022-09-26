package productservice.com.example.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import productservice.com.example.productservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}

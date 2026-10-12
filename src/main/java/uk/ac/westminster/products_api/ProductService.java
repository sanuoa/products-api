package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }


    public Optional <Product> findById(Long id){
        return products.stream().filter(p->p.getId().equals(id)).findFirst();
    }
}

package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")


public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id).orElse(null);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteById(id);
    }

    @PostMapping("/search")
    public List<Product> search(String name) {
        return productService.findByName(name);
    }
}

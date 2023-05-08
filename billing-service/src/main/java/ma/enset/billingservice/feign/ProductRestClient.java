package ma.enset.billingservice.feign;


import ma.enset.billingservice.model.Customer;
import ma.enset.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductRestClient {
    /*@GetMapping(path = "/products")
    PagedModel<Product> pageProducts(@RequestParam(value="page") int page,@RequestParam(value="size") int size);
     */
    @GetMapping(path = "/products")
    PagedModel<Product> pageProducts();
    @GetMapping(path = "/products/{id}")
    Product getProductById(@PathVariable Long id);
}

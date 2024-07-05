package com.Nimap.MachineTest_TejasDube.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nimap.MachineTest_TejasDube.Entity.Product;
import com.Nimap.MachineTest_TejasDube.Service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping()
	public List<Product> getAllProduct() {
		return productService.getAllproduct();
	}

	@GetMapping("/{id}")
	public Product getbyid(@PathVariable long id) {
		return productService.getCategoryById(id);
	}

	@PostMapping()
	public Product postProduct(@RequestBody Product product) {
		return productService.postproduct(product);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		productService.deleteByid(id);
	}

	@PutMapping("/{id}")
	public Product update(@PathVariable long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

}

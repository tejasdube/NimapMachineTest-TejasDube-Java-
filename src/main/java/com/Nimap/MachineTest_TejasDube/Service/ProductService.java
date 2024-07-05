package com.Nimap.MachineTest_TejasDube.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nimap.MachineTest_TejasDube.Entity.Category;
import com.Nimap.MachineTest_TejasDube.Entity.Product;
import com.Nimap.MachineTest_TejasDube.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> getAllproduct() {
		return (List<Product>) productRepo.findAll();
	}
	
	public Product getCategoryById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

	public Product postproduct(Product product) {
		return productRepo.save(product);
	}

	public void deleteByid(long id) {
		productRepo.deleteById(id);
	}

	public Product updateProduct( long id, Product product) {
		product.setId(id);
		return productRepo.save(product);
	}

}

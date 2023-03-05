package com.canddella.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.canddella.springdemo.entity.Customer;
import com.canddella.springdemo.entity.Product;
import com.canddella.springdemo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/list")
	public String listProducts(Model theModel) {

		List theProducts = (List) productService.getProducts();

		theModel.addAttribute("products", theProducts);

		return "list-products";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Product theProduct = new Product();

		theModel.addAttribute("roduct", theProduct);

		return "product-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Product theProduct) {

		productService.saveProduct(theProduct);

		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int theId, Model theModel) {

		Product theProduct = productService.getProduct(theId);

		theModel.addAttribute("product", theProduct);

		return "product-form";
	}

	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theId) {

		productService.deleteProduct(theId);

		return "redirect:/product/list";
	}
}

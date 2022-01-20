package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.CustomerDim;
import SCMProject.Prakat.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String sayHello() {
		return "This is our customer controller api";
	}
	
	@GetMapping("/list")
	public List<CustomerDim> getList()
	{
		return customerService.getAll();
	}
	
	@PostMapping("/save")
	public CustomerDim save(@RequestBody CustomerDim customerDim) {

		customerService.save(customerDim);
		return customerDim;
	}
}

package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.ProductDim;
import SCMProject.Prakat.service.ProductDimService;

@RestController
@RequestMapping("/productdim")
public class ProductDimController {

	@Autowired
	private ProductDimService productDimService;
	
	@GetMapping("/list")
	public List<ProductDim> getAll()
	{
		return productDimService.getAll();
	}
}

package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.ShelfLife;
import SCMProject.Prakat.service.ShelfLifeService;

@RestController
@RequestMapping("/shelflife")
public class ShelfLifeController {

	@Autowired
	private ShelfLifeService shelfLifeService;
	
	/*@GetMapping("/list")
	public List<ShelfLife> getAll()
	{
		return shelfLifeService.getAll();
	}*/

	//Given a promised shelf life, compute the contract index
	@GetMapping("/get")
	public List<ShelfLife> getByShelfLifeAndCustomerID(@RequestParam(name="shelflife", required = true) int shelflife,@RequestParam(name="customerid", defaultValue = "0") int id){
		
		return shelfLifeService.getByShelfLifeAndCustomerID(shelflife, id);
	}
}

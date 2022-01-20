package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.DemandDelivery;
import SCMProject.Prakat.service.DemandDeliveryService;

@RestController
@RequestMapping("/demanddelivery")
public class DemandDeliveryController {

	@Autowired
	private DemandDeliveryService demandDeliveryService;
	
	@GetMapping("/list")
	public List<DemandDelivery> getAll()
	{
		return demandDeliveryService.getAll();
	}
}

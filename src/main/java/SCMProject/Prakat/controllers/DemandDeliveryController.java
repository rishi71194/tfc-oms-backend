package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	//Find the number of instances where service level (order line) was not met – for a
	//customer/product.
	@GetMapping("/{d}")
	public List<DemandDelivery> getByDateId(@PathVariable int d)
	{
		return demandDeliveryService.getByDateID(d);
	}


	//Find the number of instances where service level (order line) was not met – for a
	//customer per product.
	@GetMapping("/getcustomer")
	public List<DemandDelivery> getSLNotMet(@RequestParam(value="customerid", required = true) int cid, @RequestParam(value="productid", defaultValue ="1" ) int pid)
	{
		List<DemandDelivery> list =  demandDeliveryService.getByCustomerProduct(cid, pid);
		return list;
	}

	@GetMapping("/getweekly")
	public List<DemandDelivery> getWeeklyDemand(@RequestParam(value="yearnumber", required = true) int yn,
							   @RequestParam(value="weeknumber", defaultValue ="0", required = true ) int wn,
							   @RequestParam(value="cid", defaultValue ="603", required = true ) int cid,
							   @RequestParam(value="pid", defaultValue ="1", required = true ) int pid)
	{
		List<DemandDelivery> list = demandDeliveryService.getByDemandPerWeek(yn, wn, cid, pid);
		return list;
	}

}

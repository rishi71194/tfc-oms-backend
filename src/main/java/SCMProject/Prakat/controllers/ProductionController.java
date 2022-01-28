package SCMProject.Prakat.controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.DateDim;
import SCMProject.Prakat.model.Production;
import SCMProject.Prakat.service.DateDimService;
import SCMProject.Prakat.service.ProductionService;

@RestController
@RequestMapping("/production")
public class ProductionController {
	
	@Autowired
	private ProductionService productionService;
	@Autowired
	private DateDimService dateDimService;
	
	@GetMapping("/list")
	public List<Production> getAll()
	{
		return productionService.getAll();
	}
	
	 
	//Compute stockEOD(t) from stockEOD(t-1), customer delivery, production, rejects,
	//obsoletes, startuploss, backorder etc
	@GetMapping("/getbydate")
	public List<Production> getProduction(@RequestParam(name="date", required = true) String date, @RequestParam(name="productid", defaultValue = "0") int productid){
		//return productionService.getAll();
		DateDim ob =  (DateDim) dateDimService.getByDate(date);
		System.out.println(ob);
		int dateid = ob.getDateID();
		//System.out.println(dateid);
		return productionService.getProductionByDateIDAndProductID(dateid, productid);
	}
	
	@GetMapping("/getbymonth")
	public List<Production> getProductionByMonth(@RequestParam(name="year", required = true) int year, @RequestParam(name="month", required = true) int month){
		List<DateDim> ob =  dateDimService.getByYearAndMonth(year,month);
		int enddateid = ob.get(ob.size()-1).getDateID();
		int startdateid = ob.get(0).getDateID();
		List<Production> stock = productionService.getProductionByDateID(enddateid, 0);
		List<Production> other = productionService.getProductionByDateRange(startdateid, enddateid, 0);
		//System.out.println(other.toString());
		for(int i=0;i<stock.size();i++)
		{
			Production pr = new Production();
			pr.setDateID(enddateid);
			pr.setStockEOD(stock.get(i).getStockEOD());
			pr.setProductID(other.get(i).getProductID());
			pr.setDeliveryFromProduction(other.get(i).getDeliveryFromProduction());
			pr.setObsoletes(other.get(i).getObsoletes());
			pr.setInBackorder(other.get(i).getInBackorder());
			pr.setRejection(other.get(i).getRejection());
			pr.setStartupLoss(other.get(i).getStartupLoss());
			stock.set(i, pr);	
			
		}
		 
		 
		return stock;
	}
	
}

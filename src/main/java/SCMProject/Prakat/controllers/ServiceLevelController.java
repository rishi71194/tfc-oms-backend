package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.ServiceLevel;
import SCMProject.Prakat.service.ServiceLevelService;

@RestController
@RequestMapping("/servicelevel")
public class ServiceLevelController {

	@Autowired
	private ServiceLevelService serviceLevelService;
	
	/*@GetMapping("/list")
	public List<ServiceLevel> getAll(){
		return serviceLevelService.getAll();
	}
	*/
	@GetMapping("/getservice")
	public List<ServiceLevel> getAll(@RequestParam(value="level", required = true) int level, @RequestParam(value="customerid", defaultValue = "0") int id){
		//System.out.println(level+" "+id);
		return serviceLevelService.getByServiceAndCustomerId(level,id);
	}

}

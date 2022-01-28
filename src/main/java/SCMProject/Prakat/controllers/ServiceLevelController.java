package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/{from}/{to}")
	@ResponseBody
	public String getServiceLevelByDate(@PathVariable String from, @PathVariable String to) {
		return serviceLevelService.getByDate(from,to);
	}

}

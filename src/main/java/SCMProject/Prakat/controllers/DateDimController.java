package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.DateDim;
import SCMProject.Prakat.service.DateDimService;

@RestController
@RequestMapping("/datedim")
public class DateDimController {

	@Autowired
	private DateDimService dateDimService;
	
	
	@GetMapping("/list")
	public List<DateDim> getAll(){
		return dateDimService.getAll();
		
	}

	//getByDateId needed
}

package SCMProject.Prakat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SCMProject.Prakat.model.BonusPenalty;
import SCMProject.Prakat.service.BonusPenaltyService;

@RestController
@RequestMapping("/bp")
public class BonusPenaltyController {

	@Autowired
	private BonusPenaltyService bonusPenaltyService;

	@GetMapping("/list")
	public List<BonusPenalty> getAll()
	{
		return bonusPenaltyService.getAll();
	}
	
}

package com.trial.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController {
	@Autowired
	private PlacementService placementService;
	@GetMapping("/placements")
	public List<Placement> getAllRecords()
	{
		return placementService.getAllPlacement();
	}
	@PostMapping("/placements")
	public void insertingRecord(@RequestBody Placement placement) {
		placementService.insert(placement);
		
	}
}

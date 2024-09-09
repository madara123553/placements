package com.trial.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementService {
	@Autowired
	
	private PlacementRepository placementRepository;
	
	public List<Placement> getAllPlacement()
	{
		return placementRepository.findAll();
	}
	public void insert(Placement placement)
	{
		placementRepository.save(placement)
	}

}
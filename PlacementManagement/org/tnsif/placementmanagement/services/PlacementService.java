package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.tnsif.placementmanagement.entities.Placement;

import org.tnsif.placementmanagement.repository.PlacementRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	@Autowired
	private PlacementRepository repo;
	
	//addition/creation/insertion
	public void add(Placement placement)
	{
		repo.save(placement);
	}
	//Retrieve with specific id
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	//to retrieve all the records
	public List<Placement>retreiveAll()
	{
		return repo.findAll();
	}
}



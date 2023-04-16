package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.entities.College;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.repository.CollegeRepository;
import org.tnsif.placementmanagement.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	
	//addition/creation/insertion
	public void add(User user)
	{
		repo.save(user);
	}
	//Retrieve with specific id
	public User retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	//to retrieve all the records
	public List<User>retreiveAll()
	{
		return repo.findAll();
	}
}


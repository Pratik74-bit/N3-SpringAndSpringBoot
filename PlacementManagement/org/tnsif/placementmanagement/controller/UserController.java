package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.entities.User;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	//RESTful API For CRUD Operation
	//to retrieve all the records
	@GetMapping("/users")
	public List<User>listAll()
	{
		return service.retreiveAll();
	}
	//retrieve with specific id
	@GetMapping("/users/{id}")
	public ResponseEntity<User>get(@PathVariable Integer id)
	{
		try
		{
			User user=service.retrieve(id);
			 return new ResponseEntity<User>(user, HttpStatus.OK);

			
		}
		catch(NoSuchElementException e)
		{
			 return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

		}
	}
	@DeleteMapping("/users/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//to insert a data
	@PostMapping("/users")
	public void insert(@RequestBody User user)
	{
		service.add(user);
	}
	//update a data
	@PutMapping("/users/{id}")
	public ResponseEntity<?>update(@RequestBody User user, @PathVariable Integer id)
	{
		try {
			User s1=service.retrieve(id);
			service.add(user);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
		
	}
}
package com.example.demo;



import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;


@CrossOrigin
@RestController
public class BugController {

	@Autowired
	private BugRepository repo;

	@Autowired
	private JmsTemplate template;

@PostMapping("/bug")
@ApiOperation(consumes = "application/json", value = "create Bug")
public String addBug(@Valid @RequestBody Bug b)
{
	template.convertAndSend("bug_queue", b);
		repo.save(b);
		return "Bug owner"+b.getOwner()+"is added";
}
	
	@GetMapping("/bug")
	public ArrayList<Bug> displayAllBugss()
	{
			
			return (ArrayList<Bug>)repo.findAll();
	}
	@GetMapping("/bug/{id}")
	public Bug displayBugById(@PathVariable int id)
	{
			
			return repo.findById(id).orElse(null);
	}
	@DeleteMapping("/bug/{id}")
	public String deleteBugById(@PathVariable int id)
	{
			repo.deleteById(id);
			return "Bug with id "+id+"is deleted";
}
}

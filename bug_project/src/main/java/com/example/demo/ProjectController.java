package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;

	@PostMapping("/project")
	public String createProject(@Valid @RequestBody Project p) {
		projectService.createProject(p);
		return "Project" + p.getId() + "is added";
	}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProjectService {
	@Autowired
	ProjectRepository projectRepo;

	String createProject(@RequestBody Project p) {
		projectRepo.save(p);
		return "Project id" + p.getId() + "is added";
	}

}

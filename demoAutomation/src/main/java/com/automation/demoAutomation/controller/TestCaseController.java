package com.automation.demoAutomation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automation.demoAutomation.model.TestCase;
import com.automation.demoAutomation.service.TestCaseService;

@RestController
public class TestCaseController {

	
//	@GetMapping("/students/{studentId}/courses")
//	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
//		return studentService.retrieveCourses(studentId);
//	}
//	
	@GetMapping("/getTestCase")
	public String getTestCase() {
return "Welcome";
	}
	
	@PostMapping("/createTestCase")
	public ResponseEntity<String> createTestCase(@RequestBody TestCase testCase) {
		
		System.out.println("print" + testCase.getTestCaseID());

//		Course course = studentService.addCourse(studentId, newCourse);
//
//		if (course == null)
//			return ResponseEntity.noContent().build();
//
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
//				"/{id}").buildAndExpand(course.getId()).toUri();

		return ResponseEntity.ok("Done");
	}

	
}

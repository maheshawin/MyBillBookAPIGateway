package com.mybillbook.org;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class FallBackMethodController {
 
	@GetMapping("/userServiceFallBackMethod")
	public String userServiceFallBackMethod() {
		return "User service is taking longer than Expected."+" Please try again later";
	}
	
	@GetMapping("/storeServiceFallBackMethod")
	public String storeServiceFallBackMethod() {
		return "Department service is taking longer than Expected."+" Please try again later";
	}
}
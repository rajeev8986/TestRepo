package example1;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping("/login")
	public String welocme(){
		return "Welcome";
	}

}

package com.wildcodeschool.DoctorName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DoctorNameApplication {


	public static void main(String[] args) {
		SpringApplication.run(DoctorNameApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>\n" +
				"        <li><a href=\" /doctor/1\">Doctor number 1</a></li>\n" +
				"        <li><a href=\" /doctor/2\">Doctor number 2</a></li>\n" +
				"        <li><a href=\" /doctor/3\">Doctor number 3</a></li>\n" +
				"        <li><a href=\" /doctor/4\">Doctor number 4</a></li>\n" +
				"    </ul>";
	}


	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "David Tennant";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Paul McGann";
	}
}

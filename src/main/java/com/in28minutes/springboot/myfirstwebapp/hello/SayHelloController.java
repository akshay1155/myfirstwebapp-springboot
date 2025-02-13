package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//"say-hello" => "Hello! What are you learning today?"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<meta charset=\"UTF-8\">");
		sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML page with body - Changed");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	//   "say-hello-jsp" => sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}

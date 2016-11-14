package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import generatedSource.com.tanmoy.mypackage.AdditionWebService;



@Controller
public class HelloController{
	
	@Autowired
	private AdditionWebService service;
 
   public AdditionWebService getService() {
		return service;
	}

	public void setService(AdditionWebService service) {
		this.service = service;
	}

@RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }

@RequestMapping(value = "/add", method = RequestMethod.GET)
public String requestParameterGetProcess(@RequestParam("num1") String num1,
		@RequestParam("num2") String num2, ModelMap model) {
	int result=service.addTwo(Integer.parseInt(num1), Integer.parseInt(num2));
	model.put("result", +result);

	return "helloform";

}
}
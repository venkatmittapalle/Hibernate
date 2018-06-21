package com.venki.springmvc.controller;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping(value="/1")
	public String method1(ModelMap model) {
		model.addAttribute("test", "Method 1111 is called");
		return "welcome";
	}
	
	@Requestmapping(value="/")
	public ModelAndView method3() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("abc", "Welcome to model and view");
		mv.setViewName("welcome");
		return mv;
	}

	@RequestMapping(value="/2", method = RequestMethod.GET )
	public String method2(ModelMap model) {
		model.addAttribute("test", "Method 2222 is called");
		return "welcome";
	}
}

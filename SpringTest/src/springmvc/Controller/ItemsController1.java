package springmvc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springmvc.Pojo.Student;

public class ItemsController1 implements Controller {
	
    @Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List <Student> list =new ArrayList<Student>();
		list.add(new Student("tuchen1","22","f"));
		list.add(new Student("tuchen2","12","m"));
		ModelAndView modelAndView =new ModelAndView();
		
		//相当于request的setAttribut 在jsp页面通过list取数据；
		modelAndView.addObject("list",list);
		//指定视图
		modelAndView.setViewName("/WEN-INF/jsp/query.jsp");
		return modelAndView;
	}
	}



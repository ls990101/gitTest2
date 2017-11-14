package com.win.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.win.pojo.Airquality;
import com.win.service.AirqualityService;
@Controller
public class AirqualityController {
	
		@Autowired
		private AirqualityService as;

		public AirqualityService getAs() {
			return as;
		}

		public void setAs(AirqualityService as) {
			this.as = as;
		}
		@RequestMapping("/getAll")
		public String getAll(@RequestParam(defaultValue="1")int size,HttpServletRequest request){
			
			int begin = (size-1)*3;
			
			List<Airquality> list = as.getAll(begin, 3);
			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("size", size);
			int count = as.count();
			int pageNo = count%3==0?count/3:count/3+1;
			request.getSession().setAttribute("pageNo", pageNo);
			request.getSession().setAttribute("count", count);
			return "index.jsp";
		}
		@RequestMapping("/insert")
		public String insert(Airquality airquality,HttpServletRequest request){
			System.out.println(airquality);
			if (as.insert(airquality)) {
				return "getAll";
			}else {
				return "add.jsp";
			}
		}
}

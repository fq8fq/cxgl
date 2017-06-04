package  com.cx.controller;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cx.entity.Priv;
import com.cx.entity.User;
import com.cx.service.UserService;

@Controller
/*@RestController*/
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public String home() {
    
      return "login";
    }
    
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
       map.put("name", "libai");
       return "hello";
    }
    
    @RequestMapping(value="/login"/*,method=RequestMethod.POST*/)
    public String login(@RequestParam("username") String username, 
                           @RequestParam("password") String password,Map<String,Object> map){
    	
    	boolean isLoginSucc = userService.login(username,password);
    	if(isLoginSucc){
    		List<Priv> list = userService.priv(username);
    		map.put("privs", list);
    		
    		return "main";
    		
    	}else{
    		
    		return "login";
    	}
    	/*map.put("name", "libai");
    	return "hello";*/
    	
    }
    

    @RequestMapping(value="/addUser",method=RequestMethod.POST)
    public boolean addUser(@RequestParam("username") String username, 
                           @RequestParam("password") String password) {
        return userService.addUser(username,password);
    }
    

    @RequestMapping(value="/addUserWithBackId"/*,method=RequestMethod.POST*/)
    public User addUserWithBackId(@RequestParam("username") String username, 
                                     @RequestParam("password") String password) {
    	System.out.println(username);
        return userService.addUserWithBackId(username, password);
    }
    
}
package com.codingdojo.DaikichiPathVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
// 1. Annotation
@RestController
public class FirstprojectApplication {
        public static void main(String[] args) {
                SpringApplication.run(FirstprojectApplication.class, args);
        }
        
        // 1. Annotation
        
        
       
        @RequestMapping("/daikichi/travel/{city}")
        // 3. Method that maps to the request route above
        public String variables(@PathVariable("city") String city) { // 3
                return "Congratulations!You will soon travel to " + city;
        }
        
        @RequestMapping("/daikichi/lotto/{num}")
        // 3. Method that maps to the request route above
        public String vary(@PathVariable("num") int num) { // 3
        	if(num % 2 == 0) {
        		return "You will take a grand journey in the near future , but be weary of temting offers";
        		
        	}
        	else {
        		return "You enjoyed the fruits of your labor";
        	}
                
        }
      
}















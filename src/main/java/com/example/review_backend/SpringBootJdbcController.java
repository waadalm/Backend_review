package com.example.review_backend;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@CrossOrigin(origins ="*")
public class SpringBootJdbcController {
    
    @Autowired  
    JdbcTemplate jdbc; 

    
@RequestMapping(path="/addReview", method = RequestMethod.POST)
public String StoreData( @RequestBody String request) throws IOException{
    ObjectMapper myMapper = new ObjectMapper();
    JsonNode extractedData = myMapper.readTree(request);
    String username = extractedData.get("username").asText();
    String reviewRate = extractedData.get("reviewRate").asText();
    String reviewComment = extractedData.get("reviewComment").asText();
    System.out.println(username);
    System.out.println(reviewRate);
    System.out.println(reviewComment);
    // replace with your table query
  
    jdbc.execute("INSERT INTO `sys`.`review` (`comment`, `rate`, `name`) VALUES ('"+reviewComment+"','"+reviewRate+"','"+username+"');");

    return"data inserted Successfully";  

}
    @RequestMapping(path = "/getItems", method = RequestMethod.GET) 
    
    public List<Item> getItems() throws IOException{
        List<Item> items = jdbc.query("SELECT * FROM `sys`.`course`", new ItemMapper());
        return items;
}

}

    // @Autowired
    // JdbcTemplate jdbc;

    // @RequestMapping("/insert")
    // public String index(){
    //     jdbc.execute("INSERT INTO `sys`.`course` (`idCourse`, `courseName`, `courseDesc`, `courseDuration`, `cStartDate`, `cEndDate`, `cLocation`, `cLevel`) VALUES ('100', 'Best course', 'Best course', '1 MONTH', '09-JUL-2023', '09-AUG-2023', 'ONLNE', 'Entry Level');");
    //     return "Insertion successful";
    // }



// http://localhost:2400/
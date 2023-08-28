package org.api.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * This Rest Controller is to expose user services such as GET User, POST User etc
 */

@RestController
public class UserController {

    @Autowired
    PersonService personService;

    @GetMapping("/user/{id}")
    public ResponseEntity getUserById(@PathVariable(value="id") int userId, HttpServletRequest request){
        try{
            return personService.getUserById(userId,request);
        }catch (Exception x){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(x.getMessage());
        }


    }



}

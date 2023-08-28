package org.api.service;

import jakarta.servlet.http.HttpServletRequest;
import org.api.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * person crud operations are handling
 */

@Service
public class PersonService {
    Logger logger = Logger.getLogger("PersonService");


    /**
     * GET User by ID
     */
    public ResponseEntity getUserById(int personId, HttpServletRequest request) throws Exception{
        Person person = new Person(1,"shehani");
        return ResponseEntity.status(HttpStatus.OK).body(person);
    }




}


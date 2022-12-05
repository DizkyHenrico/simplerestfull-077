/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project04.project04;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author User
 */
@ControllerAdvice
public class ProductException {
    @ExceptionHandler(value = ProductNotFound.class)
    public ResponseEntity<Object> exception(ProductNotFound exception) {
      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
    } 
}

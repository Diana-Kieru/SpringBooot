package com.project.Ecommercebackend.api.controller.auth;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class AutheniticationController {

  @PostMapping("/register")
  public void registeruser(){
System.out.println("Registering user");



  }

}

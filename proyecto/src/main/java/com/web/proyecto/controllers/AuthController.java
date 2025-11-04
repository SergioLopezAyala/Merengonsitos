package com.web.proyecto.controllers;

import com.web.proyecto.dtos.LoginDto;
import com.web.proyecto.services.AutenticationService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AutenticationService autenticationService;
    @PostMapping("/login")
    public ResponseEntity<Boolean> loginUser(@RequestBody LoginDto loginDto){
        return ResponseEntity.status(HttpStatus.OK).body( autenticationService.login(loginDto));
    }

}
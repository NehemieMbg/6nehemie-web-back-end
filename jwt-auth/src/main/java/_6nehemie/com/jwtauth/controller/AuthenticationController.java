package _6nehemie.com.jwtauth.controller;

import _6nehemie.com.jwtauth.models.AuthenticationResponse;
import _6nehemie.com.jwtauth.models.User;
import _6nehemie.com.jwtauth.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody User request) {
        
        return ResponseEntity.ok(authenticationService.register(request));
    }
    
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody User request) {

        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}

package com.example.addressBook.controller;

import com.example.addressBook.dto.AuthUserDTO;
import com.example.addressBook.dto.LoginDTO;
import com.example.addressBook.dto.PasswordResetDTO;
import com.example.addressBook.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for user authentication and password management")  // 🔹 Swagger Tag
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    // 🔹 Register User
    @Operation(summary = "Register a new user", description = "Registers a new user using name, email, and phone.")
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody AuthUserDTO user) {
        return ResponseEntity.ok(authenticationService.register(user));
    }

    // 🔹 Login User
    @Operation(summary = "Login user", description = "Logs in a user using email and phone (as password).")
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO user) {
        return ResponseEntity.ok(authenticationService.login(user));
    }

    // 🔹 Forgot Password (User provides email & new phone)
    @Operation(summary = "Forgot Password", description = "Allows users to reset their password by providing their email and new phone (as password).")
    @PutMapping("/forgotPassword/{email}")
    public ResponseEntity<String> forgotPassword(@PathVariable String email, @RequestBody PasswordResetDTO passwordResetDTO) {
        return ResponseEntity.ok(authenticationService.forgotPassword(email, passwordResetDTO.getNewPhone()));
    }

    // 🔹 Reset Password (User provides email, current phone & new phone)
    @Operation(summary = "Reset Password", description = "Allows users to change their password by providing their email, current phone (as password), and new phone (as password).")
    @PutMapping("/resetPassword/{email}")
    public ResponseEntity<String> resetPassword(@PathVariable String email, @RequestBody PasswordResetDTO passwordResetDTO) {
        return ResponseEntity.ok(authenticationService.resetPassword(email, passwordResetDTO.getCurrentPhone(), passwordResetDTO.getNewPhone()));
    }
}

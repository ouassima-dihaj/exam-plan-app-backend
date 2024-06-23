//package com.ensah.examplan.controller;
//
//import com.ensah.examplan.model.UserInfo;
//import com.ensah.examplan.service.UserInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:3000")
//public class UserInfoController {
//
//    @Autowired
//    private UserInfoService userInfoService;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @PostMapping("/userInfo")
//    public String addUserInfo(@RequestBody UserInfo userInfo){
//        userInfoService.addUserInfo(userInfo);
//        return "user added successfully";
//    }
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody UserInfo userInfo) {
//        try {
//            UserDetails userDetails = userDetailsService.loadUserByUsername(userInfo.getName());
//            if (passwordEncoder.matches(userInfo.getPassword(), userDetails.getPassword())) {
//                Authentication authentication = authenticationManager.authenticate(
//                        new UsernamePasswordAuthenticationToken(userInfo.getName(), userInfo.getPassword())
//                );
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//                return ResponseEntity.ok("Login successful");
//            } else {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//            }
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//        }
//    }
//
//}

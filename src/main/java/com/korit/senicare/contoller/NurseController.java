package com.korit.senicare.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korit.senicare.dto.response.nurse.GetSignInResponseDto;
import com.korit.senicare.service.NurseService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/nurse")
@RequiredArgsConstructor
public class NurseController {

    private final NurseService nurseService;

    @GetMapping("/sign-in")
    public ResponseEntity<? super GetSignInResponseDto> getSignIn(
        @AuthenticationPrincipal String userId
    ) {
        ResponseEntity<? super GetSignInResponseDto> response = nurseService.getSignIn((userId));
        return response;
    }
    
    
}

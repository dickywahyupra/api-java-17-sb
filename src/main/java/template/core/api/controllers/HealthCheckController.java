package template.core.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import template.core.api.response.ApiResponse;

@RestController
public class HealthCheckController {
    @GetMapping(value = "/ping")
    public ResponseEntity<ApiResponse> HealthCheck() {
        return new ResponseEntity<ApiResponse>(
            new ApiResponse("success", HttpStatus.OK.value(), "BEEP BEEP HALLO MANTAN :)"),
            HttpStatus.OK
        );
    }
}
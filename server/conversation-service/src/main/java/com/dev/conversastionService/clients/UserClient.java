package com.dev.conversastionService.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.dev.conversastionService.dto.UserDto;
import com.dev.conversastionService.model.UserPrincipal;

@FeignClient("USER-SERVICE")
public interface UserClient {
    @GetMapping("user/extract-user")
    public ResponseEntity<UserDto> extractUser(@RequestHeader("Authorization") String token);

}

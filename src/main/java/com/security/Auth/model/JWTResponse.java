package com.security.Auth.model;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JWTResponse {
    private String jwtToken;
    private String username;
}

package com.example.JwtAuthentication.Model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
  private String id;
  private String name;
  private String email;
}

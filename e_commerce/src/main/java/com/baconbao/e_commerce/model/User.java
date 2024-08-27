package com.baconbao.e_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User  {
    @Id
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String address;
    private String phone;
    private LocalDateTime create_at;
    @Enumerated(EnumType.STRING)
    private Role role;

}

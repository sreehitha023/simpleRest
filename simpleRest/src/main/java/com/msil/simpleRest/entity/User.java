package com.msil.simpleRest.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    private int id;
    private String username;
    private String gender;
}

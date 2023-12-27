package com.fortunate.kafka101.payload;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}

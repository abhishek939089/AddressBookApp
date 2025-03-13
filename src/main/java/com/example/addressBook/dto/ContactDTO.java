package com.example.addressBook.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}

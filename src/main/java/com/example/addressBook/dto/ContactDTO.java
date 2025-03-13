package com.example.addressBook.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public @Data class ContactDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
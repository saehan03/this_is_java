package com.mjc813.petapp.pet;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PetRequestDto {
    private Integer rowCount;
    private String searchName;
}
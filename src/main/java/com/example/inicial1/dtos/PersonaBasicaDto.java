package com.example.inicial1.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaBasicaDto {

    private Long id;
    private String nombre;
    private String apellido;
}

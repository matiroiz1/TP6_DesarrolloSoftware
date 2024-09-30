package com.example.inicial1.dtos;


import com.example.inicial1.entities.Domicilio;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDomDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private Domicilio domicilio;
}

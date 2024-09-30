package com.example.inicial1.dtos;

import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.entities.Libro;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private Domicilio domicilio;
    private List<Libro> libros;
}

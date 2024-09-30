package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString
@Entity
@Table(name = "Libro")
@Audited

public class Libro extends Base {

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;

    @Builder.Default
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores = new ArrayList<>();
}

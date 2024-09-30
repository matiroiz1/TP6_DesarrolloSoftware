package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString
@Entity
@Table(name = "Domicilio")
@Audited
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    //Con optional no le permito que no exista esta instancia, siempre que creo una persona estará asignada a un domicilio
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}

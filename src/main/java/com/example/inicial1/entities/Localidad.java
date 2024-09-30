package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString
@Entity
@Table(name = "Localidad")
@Audited
public class Localidad extends Base{

    @Column(name = "denominacion")
    private String denominacion;
}

package com.example.jornada.model;

import com.example.jornada.utils.ConfigUrl;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = ConfigUrl.SCHEMA_CURSO, name = "estado")
public class Estado {

    @Id
//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "estado_id_seq")
//    @SequenceGenerator(name = "estado_id_seq", sequenceName = ConfigUrl.SCHEMA_CURSO + ".estado_id_seq", allocationSize=1)
    @Column
    private Integer id;

    @Column
    private String nome;

    @Column
    private String sigla;

}

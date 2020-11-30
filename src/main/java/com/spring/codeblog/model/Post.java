package com.spring.codeblog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private Long id;

    @NotBlank(message="O campo nome é obrigatório!")
    @Getter @Setter private String titulo;

    @NotBlank(message="O campo autor é obrigatório!")
    @Getter @Setter private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @Getter @Setter private LocalDate data;

    @NotBlank(message="Por favor, digite algum texto!")
    @Lob
    @Getter @Setter private String texto;
}

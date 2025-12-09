package br.com.cwi.crepet.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String responsavel;

    @CreationTimestamp
    private LocalDateTime dataInclusao;

    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean premium;
}
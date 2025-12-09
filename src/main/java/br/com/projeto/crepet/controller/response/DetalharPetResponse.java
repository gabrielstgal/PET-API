package br.com.cwi.crepet.controller.response;

import br.com.cwi.crepet.domain.Tamanho;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class DetalharPetResponse {
    private Long id;
    private String nome;
    private String responsavel;
    private LocalDateTime dataInclusao;
    private Tamanho tamanho;
    private boolean premium;
}
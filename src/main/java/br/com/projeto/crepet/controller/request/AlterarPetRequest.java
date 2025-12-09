package br.com.cwi.crepet.controller.request;

import br.com.cwi.crepet.domain.Tamanho;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlterarPetRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String responsavel;

    @NotNull
    private Tamanho tamanho;

    @NotNull
    private boolean premium;
}
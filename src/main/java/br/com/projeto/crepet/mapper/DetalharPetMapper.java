package br.com.cwi.crepet.mapper;

import br.com.cwi.crepet.controller.response.DetalharPetResponse;
import br.com.cwi.crepet.domain.Pet;

public class DetalharPetMapper {
    public static DetalharPetResponse toResponse(Pet pet) {
        DetalharPetResponse response = new DetalharPetResponse();
        response.setId(pet.getId());
        response.setNome(pet.getNome());
        response.setResponsavel(pet.getResponsavel());
        response.setDataInclusao(pet.getDataInclusao());
        response.setTamanho(pet.getTamanho());
        response.setPremium(pet.isPremium());
        return response;
    }
}
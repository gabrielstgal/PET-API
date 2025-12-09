package br.com.cwi.crepet.service;

import br.com.cwi.crepet.controller.response.DetalharPetResponse;
import br.com.cwi.crepet.controller.response.ListarPetResponse;
import br.com.cwi.crepet.domain.Pet;
import br.com.cwi.crepet.mapper.DetalharPetMapper;
import br.com.cwi.crepet.mapper.ListarPetMapper;
import br.com.cwi.crepet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static br.com.cwi.crepet.mapper.DetalharPetMapper.toResponse;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class DetalharPetService {

    @Autowired
    private PetRepository petRepository;

    public DetalharPetResponse detalhar(Long id) {
        Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Pet não encontrado"));

        return toResponse(pet);
    }
}
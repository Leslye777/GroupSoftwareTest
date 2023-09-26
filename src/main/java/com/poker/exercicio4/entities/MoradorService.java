package com.poker.exercicio4.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoradorService {
    private final MoradorRepository moradorRepository;

    @Autowired
    public MoradorService(MoradorRepository moradorRepository) {
        this.moradorRepository = moradorRepository;
    }

    public Morador criarMorador(Morador morador) {
        return moradorRepository.save(morador);
    }

    public List<Morador> listarMoradores() {
        return moradorRepository.findAll();
    }

    public Optional<Morador> buscarMorador(Long id) {
        return moradorRepository.findById(id);
    }

    public Morador atualizarMorador(Long id, Morador moradorAtualizado) {
        Optional<Morador> moradorExistente = moradorRepository.findById(id);
        if (moradorExistente.isPresent()) {
            Morador morador = moradorExistente.get();
            morador.setNome(moradorAtualizado.getNome());
            morador.setSobrenome(moradorAtualizado.getSobrenome());
            return moradorRepository.save(morador);
        }
        return null;
    }

    public boolean excluirMorador(Long id) {
        if (moradorRepository.existsById(id)) {
            moradorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

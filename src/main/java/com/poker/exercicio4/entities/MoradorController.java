package com.poker.exercicio4.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/moradores")
public class MoradorController {
    private final MoradorService moradorService;

    @Autowired
    public MoradorController(MoradorService moradorService) {
        this.moradorService = moradorService;
    }

    @PostMapping
    public Morador criarMorador(@RequestBody Morador morador) {
        return moradorService.criarMorador(morador);
    }

    @GetMapping
    public List<Morador> listarMoradores() {
        return moradorService.listarMoradores();
    }

    @GetMapping("/{id}")
    public Morador buscarMorador(@PathVariable Long id) {
        Optional<Morador> moradorOptional = moradorService.buscarMorador(id);
        return moradorOptional.orElse(null);
    }

    @PutMapping("/{id}")
    public Morador atualizarMorador(@PathVariable Long id, @RequestBody Morador moradorAtualizado) {
        return moradorService.atualizarMorador(id, moradorAtualizado);
    }

    @DeleteMapping("/{id}")
    public boolean excluirMorador(@PathVariable Long id) {
        return moradorService.excluirMorador(id);
    }
}

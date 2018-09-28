package br.com.fiap.GamesTJD.controller

import br.com.fiap.GamesTJD.model.Pontuacao
import br.com.fiap.GamesTJD.repository.JokenpokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping


@RestController
@CrossOrigin
@RequestMapping(value = "/jokenpokemon")
public class JokenpokemonController {

    @Autowired
    lateinit var jokenpokemonRepository: JokenpokemonRepository

    @GetMapping
    fun buscarTodos(): String {
        return "ok"
    }

    @PostMapping("/pontuacao")
    fun salvar(@RequestBody pontuacao: Pontuacao) {
        jokenpokemonRepository.save(pontuacao)
    }

    @GetMapping("/pontuacao")
    fun buscarRanking(): List<Pontuacao> {
        return jokenpokemonRepository.findTop10ByOrderByPontosDesc()
    }
}
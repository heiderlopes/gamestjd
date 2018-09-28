package br.com.fiap.GamesTJD.repository

import br.com.fiap.GamesTJD.model.Pontuacao
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface JokenpokemonRepository: MongoRepository<Pontuacao, String> {

    fun findTop10ByOrderByPontosDesc(): List<Pontuacao>

}
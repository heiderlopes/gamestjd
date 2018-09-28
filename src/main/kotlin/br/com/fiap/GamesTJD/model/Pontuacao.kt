package br.com.fiap.GamesTJD.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pontuacao(
        @Id val id: String?,
        var nome: String,
        var pontos: Int)
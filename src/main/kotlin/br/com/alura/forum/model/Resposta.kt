package br.com.alura.forum.model

import java.time.LocalDateTime

data class Resposta(
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: Topico,
    val solucao: Boolean
)

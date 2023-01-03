package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message = "Titulo nao pode ser em branco")
    @field:Size(min = 5, max = 100, message = "Titulo deve ter entre 5 e 10 caracteres")
    val titulo: String,
    @field:NotEmpty(message = "Mensagem nao pode ser em branco")
    val mensagem: String,
    @field:NotNull
    val idCurso: Long,
    @field:NotNull
    val idAutor: Long
)

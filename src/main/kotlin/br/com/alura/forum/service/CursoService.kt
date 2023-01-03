package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(
    var cursos: List<Curso>
) {
    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programação"
        )
        cursos = Arrays.asList(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter({ c ->
            c.id == id
        }).findFirst().get()
    }

}

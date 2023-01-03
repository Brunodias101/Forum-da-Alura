package br.com.alura.forum.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}

package com.example.testesunitario_repository.data.repository

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class UsuarioReposiotyTruthTest {

    private lateinit var repository: UsuarioRepositoryImpl

    @Before
    fun setUp() {
        repository = UsuarioRepositoryImpl()
    }

    @Test
    fun listar_comecaComNomeUsuario_retornaTrue() {
        //Dado

        //Quando
        val primeiroUsuario = repository.listar().first()
        val nomeDoUsuario = primeiroUsuario.nome
        //Então
        assertThat(nomeDoUsuario).startsWith("Nome U")
    }

    @Test
    fun listar_comecaComNomeUsuarioQualquer_retornaTrue() {
        //Dado

        //Quando
        val qualUsuario = repository.listar()[1]
        val nomeDoUsuario = qualUsuario.nome
        //Então
        assertThat(nomeDoUsuario).startsWith("Nome Do")
    }

    @Test
    fun listar_contemNomeTres_retornaTrue() {
        //Dado

        //Quando
        val resposta = repository.listar().toString()
        //Então
        assertThat(resposta).contains("Nome Tres")
    }

    @Test
    fun listar_contemNomeQuatro_retornaTrue() {
        //Dado

        //Quando
        val qualUsuario = repository.listar()[3]
        val nomeDoUsuario = qualUsuario.nome
        //Então
        assertThat(nomeDoUsuario).startsWith("Nome Quatro")
    }


    @Test
    fun listar_listaNãoVazia_retornaTrue() {
        //Dado

        //Quando
        val resposta = repository.listar()
        //Então
        assertThat(resposta).isNotEmpty()
    }



    @After
    fun tearDown() {
        // Limpeza se necessário
    }
}

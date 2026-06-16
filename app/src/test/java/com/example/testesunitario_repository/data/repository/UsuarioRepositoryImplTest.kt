package com.example.testesunitario_repository.data.repository

import com.example.testesunitario_repository.model.Usuario
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class UsuarioRepositoryImplTest {

    private lateinit var usuarioRepository: UsuarioRepositoryImpl

    @Before
    fun setUp() {
        usuarioRepository = UsuarioRepositoryImpl()
    }

    @Test
    fun salvar_salvaDadosAPI_retornaTrue() {
        //Dado
        val usuario = Usuario("Nome tres", "nometres@email", "tres@1234", "tres@1234")
        //Quando
        val resposta = usuarioRepository.salvar(usuario)
        //Entao
        assertTrue(resposta)
    }

    @Test
    fun salvar_dadosInvalidos_retornaFalse() {
        //Dado
        val usuario = Usuario("Nome um", "nomeum@email", "um@1234", "um@1234")
        //Quando
        val resposta = usuarioRepository.salvar(usuario)
        //Entao
        assertFalse(resposta)
    }


    @Test
    fun login_dadosValidos_retornaTrue() {

        //Dado
        val email = "nometres@email"
        val senha = "tres@1234"
        val confirmacaoSenha = "tres@1234"
        //Quando
        val resposta = usuarioRepository.login(email, senha, confirmacaoSenha)
        //Entao
        assertTrue(resposta)

    }

    @Test
    fun login_dadosInvalidos_retornaFalse() {
        //Dado
        val email = "nomeum@email"
        val senha = "um@1234"
        val confirmacaoSenha = "um@1234"
        //Quando
        val resposta = usuarioRepository.login(email, senha, confirmacaoSenha)
        //Entao
        assertFalse(resposta)
    }

    @Test
    fun login_dadosFail_retornaTrue() {
       //Dado
        val email = "nomeum@email"
        val senha = "um@1234"
        val confirmacaoSenha = "um@erro"
        //Quando
        val resposta = usuarioRepository.login(email, senha, confirmacaoSenha)
        //Entao
        assertTrue(resposta)
    }

    @Test
    fun atualizar_dadosValidos_retornaTrue(){
        //Dado
        val usuario = Usuario("Nome quatro", "nomequatro@email", "quatro@1234", "quatro@1234")
        //Quando
        val resposta = usuarioRepository.atualizar(usuario)
        //Entao
        assertTrue(resposta)
    }

    @Test
    fun deletar_dadosValidos_retornaFalse(){
        //Dado
        val usuario = "Nome Um"
        //Quando
        val resposta = usuarioRepository.deletar(usuario)
        //Entao
        assertFalse(resposta)
    }

    @Test
    fun listar_dadosValidos_retornaTrue(){
        //Dado

        //Quando
        val resposta = usuarioRepository.listar()
        //Entao
        assertTrue(resposta.isNotEmpty())
    }


    @After
    fun tearDown() {
        //TODO("Not yet implemented")
    }
}

package com.example.testesunitario_repository.data.repository

import com.example.testesunitario_repository.model.Usuario

interface UsuarioRepository {

    fun salvar(usuario: Usuario): Boolean

    fun login(email: String, senha: String, confiramcaoSenha: String): Boolean

    fun atualizar(usuario: Usuario): Boolean

    fun deletar(nome: String): Boolean

    fun listar(): List<Usuario>

}
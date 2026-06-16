package com.example.testesunitario_repository.data.repository

import com.example.testesunitario_repository.model.Usuario

class UsuarioRepositoryImpl: UsuarioRepository {

    override fun salvar(usuario: Usuario): Boolean {
        if (usuario.nome == "Nome tres") {
            return true
        } else {
            return false
        }
    }

    override fun login(email: String, senha: String, confiramcaoSenha: String): Boolean {
        if (email == "nometres@email" && senha == "tres@1234" && confiramcaoSenha == "tres@1234") {
            return true
        } else {
            return false
        }
    }

    override fun atualizar(usuario: Usuario): Boolean {
        if (usuario.nome == "Nome quatro") {
            return true
        } else {
            return false
        }
    }

    override fun deletar(nome: String): Boolean {

        if (nome == "Nome Um") {
            return false
        } else {
            return true
        }

    }

    override fun listar(): List<Usuario> {

        return listOf(
            Usuario("Nome Um", "nomeum@email", "um@1234", "um@1234"),
            Usuario("Nome Dois", "nomedois@email", "dois@1234", "dois@1234"),
            Usuario("Nome Tres", "nometres@email", "tres@1234", "tres@1234"),
            Usuario("Nome Quatro", "nomequatro@email", "quatro@1234", "quatro@1234")
        )
    }
}
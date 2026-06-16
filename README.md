Exercício Prático: Testes Unitários com Repository Pattern 🧪

Este repositório foi desenvolvido como um exercício prático focado na implementação e validação de **Testes Unitários** no ecossistema Android/Kotlin. 
O objetivo principal foi consolidar o entendimento sobre a criação de contratos de dados (interfaces) e isolamento de regras de negócios para testes.

## 🚀 Tecnologias e Conceitos Utilizados

* **Linguagem:** Kotlin
* **Padrão de Arquitetura:** Repository Pattern (Separação de Camadas)
* **Testes:** JUnit (foco na validação de fluxos lógicos de sucesso e falha)
* **Bilbioteca Truth:** Truth - Fluent assertion for Java and Andoid (https://truth.dev/)

## 🏗️ Estrutura do Projeto

O projeto simula a persistência e validação de dados de um modelo de `Usuario`, dividindo-se em:

1.  **Domain/Model (`Usuario.kt`):** Data class pura que representa a entidade de negócio.
2.  **Contrato (`UsuarioRepository.kt`):** Interface que dita as regras do que o repositório deve fazer, abstraindo a fonte de dados (Data Inversion Principle).
3.  **Implementação (`UsuarioRepositoryImpl.kt`):** Classe que implementa as regras simuladas de salvamento, login, atualização, deleção e listagem de usuários
    com dados mockados para dar suporte aos testes de unidade.

## 🔍 O que foi exercitado neste projeto?

* **Abstração com Interfaces:** Criação de contratos de repositório isolando a camada que consome os dados da camada que os gerencia.
* **Cenários de Teste:** Implementação de lógicas condicionais no repositório (`if/else`) feitas sob medida para testar múltiplos retornos (`true`/`false`)
  nas suítes de teste.
* **Mocks Estáticos:** Criação de listas estáticas na memória (`listOf`) para validar a integridade de retornos de dados múltiplos em testes de listagem.

---
Componente de Portfólio desenvolvido para fins de estudo e fixação de conceitos de testes de software.

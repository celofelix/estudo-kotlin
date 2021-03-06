package br.com.alura.bytebank.modelos

class Gerente(
    nome: String,
    CPF: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    CPF = CPF,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario
        }
}
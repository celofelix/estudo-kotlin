class Diretor(
    nome: String,
    CPF: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    CPF = CPF,
    salario = salario
) {

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
fun main() {

    println("Bem vindo ao Bytebank")

    val marcelo = Funcionario(
        nome = "Marcelo",
        CPF = "111.222.333-44",
        salario = 1000.0
    )

    println("Nome: ${marcelo.nome}")
    println("CPF: ${marcelo.CPF}")
    println("Salário: ${marcelo.salario}")
    println("Bonificação: ${marcelo.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        CPF = "222.222.333-44",
        salario = 3000.0,
        senha = 123
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.CPF}")
    println("Salário: ${fran.salario}")
    println("Salário + Bonificação: ${fran.bonificacao}")

    if(fran.autentica(124)) {
        println("Autenticada com sucesso")
    } else {
        println("Não foi possível autenticar")
    }

    val gui = Diretor(
        nome = "Gui",
        CPF = "333.333.444.-55",
        salario = 4000.0,
        senha = 123,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.CPF}")
    println("Salário: ${gui.salario}")
    println("PLR: ${gui.plr}")
    println("Salário + Bonificação + PLR: ${gui.bonificacao}")

    if(fran.autentica(123)) {
        println("Autenticada com sucesso")
    } else {
        println("Não foi possível autenticar")
    }
}
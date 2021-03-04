import br.com.alura.bytebank.exceptions.SaldoInsuficienteException

fun main() {

    println("início main")

    testaComportamentosConta()
//    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println("SaldoInsuficienteException capturada pelo catch")
        e.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}











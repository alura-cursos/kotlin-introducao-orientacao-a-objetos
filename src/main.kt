fun main() {
    println("Bem vindo ao Bytebank!")

    testarCopiasEReferencias()
    testarLacos()
    testarCondicoes(45.55)

    testarContaFake()
    testarFuncionarioFake()
    testarFuncionarioFake2(Funcionario(
        "Rogério",
        "111.111.111-11",
        3500.0,
        1
    ))
}



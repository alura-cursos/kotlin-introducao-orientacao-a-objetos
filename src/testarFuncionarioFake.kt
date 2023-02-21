fun testarFuncionarioFake() {
    val rute = Funcionario("Rute", "333.333.333-33", 2500.0, 0)

    println("\n::..:: TESTE DE FUNCIONÁRIO ::..::")
    println("____________________________________")

    println("nome: ${rute.nome}")
    println("cpf: ${rute.cpf}")
    println("salário: ${rute.salario}")
    println("cargo: ${rute.descricaoCargo()}")
    println("bonificação: ${rute.bonificacao()}")
}
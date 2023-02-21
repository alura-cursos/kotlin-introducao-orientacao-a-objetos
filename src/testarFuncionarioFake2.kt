fun testarFuncionarioFake2(funcionario: Funcionario) {

    println("\n::..:: 2º TESTE DE FUNCIONÁRIO ::..::")
    println("____________________________________")

    println("Funcionário: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("SALÁRIO: ${funcionario.salario}")
    println("CARGO: ${funcionario.descricaoCargo()}")
    println("BONIFICAÇÃO: ${funcionario.bonificacao()}")
}
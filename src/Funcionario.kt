class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val cargo: Int // 0 - Funcionário, 1 - Gerente, 2 - Diretor
) {

    fun descricaoCargo(): String = when(cargo) {
        0 -> "Funcionário"
        1 -> "Gerente"
        2 -> "Diretor"
        else -> "Funcionário"
    }

    fun bonificacao(): Double {

        return when (this.cargo) {
            0 -> salario * 0.1
            1 -> salario * 0.2
            2 -> salario * 0.35
            else -> 0.0
        }
    }

}

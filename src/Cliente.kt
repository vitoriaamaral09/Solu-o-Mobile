class Cliente(
    val id: Int,
    val nome: String,
    var saldo: Double
) {
    fun adicionarSaldo(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Saldo de R$ $valor adicionado. Saldo atual: R$ $saldo")
        } else {
            println("Valor inválido para adicionar saldo.")
        }
    }
}

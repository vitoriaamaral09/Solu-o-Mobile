class Produto(
    val id: Int,
    val nome: String,
    val preco: Double,
    var estoque: Int
) {
    fun exibirDetalhes() {
        println("ID: $id | Produto: $nome | Preço: R$ $preco | Estoque: $estoque")
    }
}
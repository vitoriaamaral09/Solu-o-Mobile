class Loja(private val produtosDisponiveis: MutableList<Produto>) {

    fun listarProdutos() {
        println("\nProdutos disponíveis:")
        for (produto in produtosDisponiveis) {
            produto.exibirDetalhes()
        }
    }

    fun finalizarCompra(cliente: Cliente, carrinho: CarrinhoDeCompras) {
        val totalCompra = carrinho.calcularTotal()

        if (totalCompra > cliente.saldo) {
            println("Saldo insuficiente. Total da compra: R$ $totalCompra | Saldo disponível: R$ ${cliente.saldo}")
            return
        }

        for ((produto, quantidade) in carrinho.getItens()) {
            if (produto.estoque < quantidade) {
                println("Estoque insuficiente para o produto: ${produto.nome}. Compra cancelada.")
                return
            }
        }

        // Atualizar estoque e saldo
        for ((produto, quantidade) in carrinho.getItens()) {
            produto.estoque -= quantidade
        }
        cliente.saldo -= totalCompra
        println("Compra finalizada com sucesso! Total: R$ $totalCompra")
        println("Saldo restante: R$ ${cliente.saldo}")

        carrinho.limparCarrinho()
    }
}

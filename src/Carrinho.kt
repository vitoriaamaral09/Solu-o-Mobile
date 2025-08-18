class CarrinhoDeCompras {
    private val itens: MutableMap<Produto, Int> = mutableMapOf()

    fun adicionarProduto(produto: Produto, quantidade: Int) {
        if (quantidade <= 0) {
            println("Quantidade inválida para o produto ${produto.nome}.")
            return
        }
        if (produto.estoque >= quantidade) {
            itens[produto] = itens.getOrDefault(produto, 0) + quantidade
            println("Adicionado $quantidade x ${produto.nome} ao carrinho.")
        } else {
            println("Estoque insuficiente para o produto ${produto.nome}.")
        }
    }

    fun removerProduto(produto: Produto) {
        if (itens.containsKey(produto)) {
            itens.remove(produto)
            println("${produto.nome} removido do carrinho.")
        } else {
            println("Produto ${produto.nome} não está no carrinho.")
        }
    }

    fun exibirCarrinho() {
        if (itens.isEmpty()) {
            println("Carrinho vazio.")
            return
        }
        println("\nItens no carrinho:")
        for ((produto, quantidade) in itens) {
            println("${produto.nome} | Quantidade: $quantidade | Subtotal: R$ ${produto.preco * quantidade}")
        }
        println("Total: R$ ${calcularTotal()}")
    }

    fun calcularTotal(): Double {
        return itens.entries.sumOf { (produto, quantidade) -> produto.preco * quantidade }
    }

    fun getItens(): Map<Produto, Int> {
        return itens
    }

    fun limparCarrinho() {
        itens.clear()
    }
}

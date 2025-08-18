fun main() {
    // Criando produtos
    val produto1 = Produto(1, "Notebook", 4500.0, 5)
    val produto2 = Produto(2, "Mouse Gamer", 250.0, 10)

    val loja = Loja(mutableListOf(produto1, produto2))

// Criando cliente
    val cliente = Cliente(1, "Ana", 5000.0)
    cliente.adicionarSaldo(2000.0)

// Criando carrinho e loja
    val carrinho = CarrinhoDeCompras()

    loja.listarProdutos()

// Adicionando produtos ao carrinho
    carrinho.adicionarProduto(produto1, 1)
    carrinho.adicionarProduto(produto2, 2)
// Exibindo o carrinho
    carrinho.exibirCarrinho()
// Tentando finalizar a compra
    loja.finalizarCompra(cliente, carrinho)

    loja.listarProdutos()
}
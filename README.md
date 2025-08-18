 Objetivo
Desenvolver um sistema de Loja Virtual em Kotlin, utilizando Orientação a
Objetos (POO). O sistema deve permitir que os clientes simulem a compra de
produtos, adicionem itens ao carrinho de compras e finalizem a compra com
pagamento.
 Requisitos do Sistema
1. Criar a Classe Produto
• Cada produto deve ter:
o id (Int) – Identificador único do produto
o nome (String) – Nome do produto
o preco (Double) – Preço do produto
o estoque (Int) – Quantidade disponível
• Método exibirDetalhes() → Exibe informações do produto
2. Criar a Classe Cliente
• Cada cliente deve ter:
o id (Int) – Identificador único
o nome (String) – Nome do cliente
o saldo (Double) – Saldo disponível para compras
• Método adicionarSaldo(valor: Double) → Permite recarregar o
saldo do cliente
3. Criar a Classe CarrinhoDeCompras
• O carrinho deve:
o Conter uma lista de produtos adicionados pelo cliente
o Permitir adicionar e remover produtos
o Calcular o total da compra
• Métodos:
o adicionarProduto(produto: Produto, quantidade: Int)
o removerProduto(produto: Produto)
o exibirCarrinho() → Exibe os itens no carrinho
o calcularTotal(): Double
4. Criar a Classe Loja
• A loja deve:
o Conter uma lista de produtos disponíveis
o Permitir que o cliente compre os produtos do carrinho
o Atualizar o estoque dos produtos
• Métodos:
o listarProdutos() → Exibe os produtos disponíveis
o finalizarCompra(cliente: Cliente, carrinho:
CarrinhoDeCompras)
 Regras de Negócio
 O cliente só pode comprar se tiver saldo suficiente.
 Se um produto não estiver no estoque, não pode ser comprado.
 Ao finalizar a compra, o estoque dos produtos deve ser atualizado.

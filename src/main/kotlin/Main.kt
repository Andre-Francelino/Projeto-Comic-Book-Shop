fun main(args: Array<String>) {

    val quadrinhos = getQuadrinhos()
    imprimir(quadrinhos, "Todos os Quadrinhos")
    val favoritos = getQuadrinhosFavoritos(quadrinhos)
    imprimir(favoritos, "Favoritos")

    val ordenados = ordenar(quadrinhos)
    imprimir(ordenados, "Ordem Alfabética")

    val zerados = precoZerado(quadrinhos)
    imprimir(zerados, "Sem preço")

//    quadrinhos.forEach {
//            quadrinho -> println(quadrinho)
//    }

    // quadrinhos.forEach { println(it) }
}

fun precoZerado(quadrinhos: List<Quadrinho>) : List<Quadrinho> {
    return quadrinhos.filter { quadrinho -> quadrinho.preco == 0f }
}

fun ordenar(quadrinhos: List<Quadrinho>) : List<Quadrinho> {
    return quadrinhos.sortedBy { it.titulo }
}

fun getQuadrinhosFavoritos(quadrinhos: List<Quadrinho>) : List<Quadrinho> {
    return quadrinhos.filter { quadrinho ->
        quadrinho.favorito
    }
}

fun imprimir(quadrinhos: List<Quadrinho>, titulo: String){
    println("")
    println("---${titulo.uppercase()}---")
    quadrinhos.forEach{
        quadrinho ->  println(quadrinho)
    }
}

fun getQuadrinhos() : List<Quadrinho>{
    return listOf(
        Quadrinho(1, "Spider Man", preco = 19.9f),
        Quadrinho(2, "X-Men: A Saga da Fênix", preco = 20.0f),
        Quadrinho(3, "Daredevil"),
        Quadrinho(4, "The Punisher"),
        Quadrinho(titulo = "Maus", codigo = 5, preco = 60.0f, favorito = true),
        Quadrinho(6, "Batman: A Piada Mortal", preco = 9.90f),
        Quadrinho(7, "Wolverine: Reunion", preco = 19.9f, favorito = true),
        Quadrinho(8, "Moby Dick"),
        Quadrinho(9, "V de Vingança", preco = 19.9f, favorito = true)
    )
}
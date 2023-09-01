data class Quadrinho(
    val codigo : Int,
    val titulo: String,
    val descricao: String = "",
    val favorito: Boolean = false,
    val preco: Float = 0.0f
){
    override fun toString() = "#$codigo - $titulo - R$: $preco - Favorito: $favorito"
}

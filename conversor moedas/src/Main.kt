fun main() {
    println("""CONVERSOR DE MOEDAS
        |Moedas disponiveis:
        |EUR    USD    GBP  
        |
        |Introduza uma moeda para fazer conversão
    """.trimMargin())

    val listaMoedas = listOf("EUR", "USD", "GBP")
    val moeda : String? = readLine()

    if (moeda in listaMoedas){
        println("Introduza o valor")
        val valor : Int? = readLine()?.toIntOrNull()

        if (valor != null) {
            println("Escolha para que moeda quer converter")
            val converterPara: String? = readLine()
        } else if (valor == null){
            print("Valor inválido")
        }
    } else if (moeda !in listaMoedas){
        print("Moeda inválida")
    }





}
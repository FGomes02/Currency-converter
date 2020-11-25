fun main() {
  print("""Conversor de unidades monetárias
      |Escolha uma moeda: 
      |EUR(1) USD(2) JPY(3)
      |Escolha introduzindo 1, 2 ou 3.
      |Moeda para converter:
  """.trimMargin())


    val moeda1 : Int? = readLine()?.toIntOrNull()
    if (moeda1 != null && (moeda1 in 1..3)) {
        if (moeda1 == 1) {
            print("Escolheu EUR.\nEUR(1) USD(2) JPY(3)\nIntoduza a moeda para qual quer converter:")
        } else if (moeda1 == 2) {
            print("Escolheu USD.\nEUR(1) USD(2) JPY(3)\nIntoduza a moeda para qual quer converter:")
        } else if (moeda1 == 3) {
            print("Escolheu JPY.\nEUR(1) USD(2) JPY(3)\nIntoduza a moeda para qual quer converter:")
        }

        val moeda2 : Int? = readLine()?.toIntOrNull()
        if (moeda2 != null && (moeda2 in 1..3)) {
            if (moeda2 == 1) {
                println("Escolheu EUR.\nIntroduza o valor que pretende converter.")
            } else if (moeda2 == 2) {
                println("Escolheu USD.\nIntroduza o valor que pretende converter.")
            } else if (moeda2 == 3) {
                println("Escolheu JPY.\nIntroduza o valor que pretende converter.")
            }

            print("Valor:")
            val valor : Float? = readLine()?.toFloatOrNull()
            if (valor != null && valor > 0) {
                if (moeda1 == 1 && moeda2 == 1) {
                    print("${valor} EUR é igual a ${EUR_TO_EUR(valor)} EUR")
                } else if (moeda1 == 1 && moeda2 == 2) {
                    print("${valor} EUR é igual a ${EUR_TO_USD(valor)} USD")
                } else if (moeda1 == 1 && moeda2 == 3) {
                    print("${valor} EUR é igual a ${EUR_TO_JPY(valor)} JPY")
                }else if (moeda1 == 2 && moeda2 == 1) {
                    print("${valor} USD é igual a ${USD_TO_EUR(valor)} EUR")
                }else if (moeda1 == 2 && moeda2 == 2) {
                    print("${valor} USD é igual a ${USD_TO_USD(valor)} USD")
                }else if (moeda1 == 2 && moeda2 == 3) {
                    print("${valor} USD é igual a ${USD_TO_JPY(valor)} JPY")
                }else if (moeda1 == 3 && moeda2 == 1) {
                    print("${valor} JPY é igual a ${JPY_TO_EUR(valor)} EUR")
                }else if (moeda1 == 3 && moeda2 == 2) {
                    print("${valor} JPY é igual a ${JPY_TO_USD(valor)} USD")
                }else if (moeda1 == 3 && moeda2 == 3) {
                    print("${valor} JPY é igual a ${JPY_TO_JPY(valor)} JPY")
                }


            } else if (valor == null) {
                print("Têm de introduzir um número")
            } else {
                print("Valor inválido")
            }



        } else if (moeda2 == null) {
            print("Têm de introduzir uma moeda")
        } else if (moeda2 !in 1..3) {
            print("Moeda inválida")
        }


    } else if (moeda1 == null) {
        print("Têm de escolher uma moeda")
    } else if (moeda1 !in 1..3){
        print("Moeda inválida")
    }


}

fun EUR_TO_EUR(x: Float): Float {
    return (x * 1f)
}


fun EUR_TO_USD(x: Float): Float {
    return (x * 1.18f)
}


fun EUR_TO_JPY(x: Float): Float {
    return  (x * 123.0f)
}


fun USD_TO_USD(x: Float): Float {
    return (x * 1f)
}


fun USD_TO_EUR(x: Float): Float {
    return (x * 0.84f)
}


fun USD_TO_JPY(x: Float): Float {
    return (x * 103.87f)
}

fun JPY_TO_JPY(x: Float): Float {
    return (x * 1f)
}


fun JPY_TO_EUR(x: Float): Float {
    return (x * 0.0081f)
}


fun JPY_TO_USD(x: Float): Float {
    return (x * 0.0096f)
}



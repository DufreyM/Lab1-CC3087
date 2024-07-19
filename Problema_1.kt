fun decimalABinario(numeroDecimal: Int): String {
    if (numeroDecimal == 0) {
        return "0"
    }
    var numero = numeroDecimal
    var binario = ""
    while (numero > 0) {
        binario = (numero % 2).toString() + binario
        numero /= 2
    }
    return binario
}

fun main() {
    print("Introduce un número decimal: ")
    val numeroDecimal = readLine()!!.toInt()
    val binario = decimalABinario(numeroDecimal)
    println("El número $numeroDecimal en binario es $binario")
}

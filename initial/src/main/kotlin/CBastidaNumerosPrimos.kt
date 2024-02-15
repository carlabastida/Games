fun main() {

    print("Ingrese un número entero: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {

        var esPrimo = true

        if (numero > 1) {
            for (i in 2 until numero) {
                if (numero % i == 0) {
                    esPrimo = false
                    break
                }
            }
        } else {

            esPrimo = false
        }

        if (esPrimo) {
            println("$numero es un número primo.")
        } else {
            println("$numero no es un número primo.")
        }
    } else {
        println("Por favor, ingrese un número entero válido.")
    }
}

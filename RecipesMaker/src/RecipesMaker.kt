fun main(args: Array<String>) {


    val ingredients= listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
        println("""
            ::Bienvenido a Recipes Maker::
            
        """.trimIndent())
        println("Tienes los siguientes ingredientes: \n$ingredients" )

    val options: String = """
        
        Selecciona la opción deseada

    1 | Hacer una receta
    2 | Ver mis recetas
    3 | Salir""".trimIndent()
        println(options)

    do {
        val response: Int = Integer.valueOf(readLine())

        when(response){
            1-> println("Hacer una receta, puedes seleccionar los ingredientes")
            2-> println("Ver mis recetas")
            3-> println("Salir")
            else-> println("Por favor, seleccione una opción válida entre 1 y 3")
        }
    }
    while (response !=3)
    println("¡Adios!")
}
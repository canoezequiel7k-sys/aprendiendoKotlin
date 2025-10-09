package com.diicano.andriod_master.sintaxis

val name = "ezequiel" //val es una variable inmutable, no se cambia.
var myName = "Ezequiel" //var es una Variable mutable, se puede cambiar.

val age:Int = 22 //variable global
val age2:Int = 23 //variable global
val floatExample:Float = 30.65432f //variable global

fun main(){
    showMyName()
    showMyAge(22)
    add(77, 42)
    val mySubtract = subtract(10, 5)
    println(mySubtract)

}

fun showMyName (){
    println("Me llamo Ezequiel")
}

fun showMyAge (currentAge:Int = 40){ //Nos aseguramos que llegue un valor
    println("tengo $currentAge de edad")
}
//Le pasamos un parametro a la funcion, le estamos diciendo que tipo de dato le va a llegar

fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}
fun subtract(firstNumber:Int, secondNumber:Int):Int {
    return firstNumber - secondNumber
    //println("Adios :(") //igualmente no se veria, porque una vez haya un return, lo que hay abajo lo ignora y no lo compila.
}

fun subtractCool(firstNumber:Int, secondNumber:Int) = firstNumber - secondNumber //Funciona en funciones chicas.


fun variablesNumericas(){

    /*---------------------
    | VARIABLES NUMERICAS |
    ----------------------*/

    //Int, -2.147.483.647 a 2.147.483.647
    val age:Int = 22
    var age2:Int = 22
    //print(age2) el codigo es secuncial, si ejecuto desde aca, va a mostrar que tenemos 22.

    age2 = 23
    //print(age2) Aca va a mostrar que tenemos 25, porque cambiamos el valor de la variable age.

    //Long, -9.233.372.036.854.775.807 a 9.233.372.036.854.775.807
    val example:Long = 30

    //Float, soporta hasta 6 decimales
    val floatExample:Float = 30.65432f //f hay que ponersela a los vartiables tipo float, el motor luego las ignora.

    //Double, soporta hasta 14 decimales
    val doubleExample:Double = 30.12345678901234


    //De esta forma, se muestra en consola peago.
    print(age2)                   //mostraria: 2323
    print(age2)

    //De esta forma, el print hace un salto de linea para adelante, no atras.
    println(age2)                 //mostraria: 23
    println(age2)                            //23


}

fun variablesAlphanumericas (){

    /*--------------------------
    | VARIABLES ALPHANUMERICAS |
    -------------------------- */

    //Char soporta 1 caracter, solo entre comillas simples.
    val charExample1:Char = 'a'
    val charExample2:Char = '1'
    val charExample3:Char = '@'

    //String soporta hasta 2.147.483.647 caracteres
    val stringExample:String = "Hola soy Ezequiel, estoy estudiando kotlin"
    val stringExample2 = "4"
    val stringExample3:String = "23"
    //Cuando estas aprendiendo a programar esta bien, pero mas adelante no, porque el motor es inteligente si busca que ocupa menos espacio en memoria para guardar tu variable.
}

fun variablesBooleanas (){

    /*--------------------
    | VARIABLES BOLEANAS |
    ---------------------*/

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false

}

fun operadoresAritmeticos(){

    /*-----------------------
    | FUNCIONES ARITMETICAS |
    ------------------------*/

    //SUMA// operador +
    println("Sumar: ")
    println(age + age2)

    //RESTA// operador -
    println("Restar: ")
    println(age2 - age)

    //MULTIPLICAR// operador *
    println("Multiplicar: ")
    println(age2 * age)

    //DIVISION// operador /
    println("Division: ")
    println(age2 / age)

    //RESTO// operador %
    println("MODULO: ")
    println(age2 % age)
}

fun concatenacion(){

    /*-------------------
    | CONCATENAR TEXTOS |
    --------------------*/
    val stringExample2 = "4"
    val stringExample3:String = "23"

    //Se concatenan y se juntan
    println(stringExample2 + stringExample3)


    //convertirmos los textos a numeros enteros
    println(stringExample2.toInt() + stringExample3.toInt())

    var stringConcatenada2:String = "Ezequiel"
    var stringConcatenada:String = "hola me llamo $stringConcatenada2 y tengo $age de edad" //Con el signo de dolar, podemos hacer referencia a otra variable.

    print(stringConcatenada)



    //Se puede sumar con dos tipos de valores, pero me lo comvierte de un tipo a otro.

    var exampleConvers = age + floatExample
    println(exampleConvers) //nos devolveria un flotante

    var exampleConvers2 = age + floatExample.toInt()
    println(exampleConvers2) //De esta forma, convertirmos la variable float en un entero

    var exampleConvers3 = age.toFloat() + floatExample
    println(exampleConvers3) //Convertimos la variable entera en flotante.
}
package com.diicano.andriod_master.sintaxis

fun main(){
    /*var name1:String = "Ezequiel"
    var name2:String = "Agustin"
    var name3:String = "Lucas"
    var name4:String = "Kevin"
    println(name2) // imprimiria el nombre de la var que le pedimos. */


    //Una array es una estructura de datos, que nos permite almacenar varias variables de forma seguida.
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday") //Tiene 7 elementos pero su indice es del 0 al 6.

    //EL INDICE DE UN ARRAY SIEMPRE COMIENZA EN 0
    println(weekDays[0]) //Mostraria MONDAY

    //Esto te dice el tamaño del  array
    println(weekDays.size) //Mostraria 7 que es "el total de elementos"

    //----------------------------------------------------------------

    /*----------------------
     |  CAMBIO DE VALORES  |
     ----------------------*/
    println(weekDays[3]) //Primero es "Monday", antes del cambio.
    weekDays[3] = "Holita"     //Cambiamos valor con su indice muestral
    println(weekDays[3]) //Despues "Holita", despues del cambio.


    //Comprueba si el array tiene 8 elementos o mas, si SI, imprime el elemento en la posicion 7, si NO, imprime el texto.
    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay mas valores en el Array")
    }


    //----------------------------------------------------------------

    /*-----------------------
     |  BUCLES PARA ARRAYS  |
     -----------------------*/

    //Simple FOR

    //Forma de ver el indice sobre la cantidad de elementos
    for(position in weekDays.indices){
        println("Indice $position")
    }
    //Forma de ver numero sobre la cantidad de elementos.
    for(position in weekDays.indices){
        println("Este es el elemento ${position + 1}")
    }
    //Forma de recorrer cada uno de los elementos.
    for(position in weekDays.indices){
        println(weekDays[position])
    }
    //Forma de devolver posicion y valor
    for(position in weekDays.indices){
        println("La posicion $position contiene ${weekDays[position]} ")
    }



    //Modern FOR

    //Forma de devolver posicion y valor mas resumida
    for((position, value) in weekDays.withIndex()){
        println("La posicion $position contiene $value")
    }

    //Esto imprime cada elemento de weekDays en una forma mas resumida.
    weekDays.forEach { println(it) }

}
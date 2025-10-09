package com.diicano.andriod_master.sintaxis

fun main(){
    //con el ? podemos decirle que puede ser nulo
    var name:String? = null

    //Con los !! le estamos diciendo que estamos seguros que no es null
    //println(name!![3])

    //Con esto le estamos diciendo "Si no es nulo, dame este valor"
    //println(name?.get(1))

    //Si name no es nulo dame la posicion 3, pero si lo es:
    println(name?.get(3) ?: "Es nulo amiguito")
}
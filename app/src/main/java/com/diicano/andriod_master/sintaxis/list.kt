package com.diicano.andriod_master.sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    println(weekDays)

    //añadir un nuevo elemento (dia)
    //weekDays.add("EzequielDay") //Asi lo agregamos al final

    weekDays.add(0,"EzequielDay") //se le puede agregar con un indice para que este en una posicion exacta.
    println(weekDays)


    //Si weekDays esta vacio...
    if(weekDays.isEmpty()){
        //no voy a printear nada porque no hay.
    }else{
        //Voy a printear los dias
        weekDays.forEach { println(it) }
    }

    //Si no esta vacio...
    if(weekDays.isNotEmpty()){
        //Voy a printear los dias
        weekDays.forEach { println(it) }
    }

    //Mostrar el ultimo.
    weekDays.last()

    //Mostrar los elementos(Es lo mismo que los array)
    for(item in weekDays){
        println("hoy es $item")
    }
}

fun inmutableList(){

    //No es necesario especificar el tipo si lo vamos a inizialicar ya.
    val readOnly:List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //Mostrar el tamaño de la lista
    println(readOnly.size)

    //Agarra todos los valores y los cita en una lista
    println(readOnly) //es lo mismo que println(readOnly.toString)

    //Acceder a un dia especifico
    println(readOnly[0])

    //Mostrar el ultimo valor
    println(readOnly.last())

    //Mostrar el primer valor
    println(readOnly.first())

    //filtrar valores. el filter le dice que cree una lista con los elementos que cumplan la condicion de tener la letra "i" de cada uno de los elementos de la lista
    val example = readOnly.filter { it.contains("i")}
    println(example)

    //Recorrer la lista [it es cada uno de los valores en su posicion]
    readOnly.forEach { println(it) } //Esto es lo mismo que;
    readOnly.forEach { weekday -> println(weekday) } //ESTO! en todos los lugares donde haya un [it] podemos remplazarlo con esto para mejor lectura de codigo.

}//Listas que no se pueden modificar
package com.diicano.andriod_master.sintaxis

fun main(){

}

//Si tenemos que anidar mas de un if, pasar de los if al when:
fun getMonthWhen(month:Int){
    //Funcion que puede o no recibir parametros
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        //Si queres poner mas de una linea, poner entre llaves {}
        4 -> {
            println("Abril")
            println("Esto es una prueba :D!")
            }
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Esto es una prueba xd")
            }
        12 -> println("Diciembre")
        else -> println("Mes invalido")
    }
}//Mucho mas optimo.

fun getMonthIf(month:Int){
    if(month == 1){
        println("Es enero")
    }else if(month == 2){
        println("Es febrero")
    }else if(month == 3){
        println("Es marzo")
    }else if(month == 4){
        println("Es abril")
    }else if(month == 5){
        println("Es mayo")
    }else if(month == 6){
        println("Es junio")
    }else if(month == 7){
        println("Es julio")
    }else if(month == 8){
        println("Es agosto")
    }else if(month == 9){
        println("Es septiembre")
    }else if(month == 10){
        println("Es octubre")
    }else if(month == 11){
        println("Es noviembre")
    }else if(month == 12){
        println("Es diciembre")
    }else{
        println("Mes invalido")
    }
}//No es optimo.

fun getTrimester(month: Int){
    when(month){
        1 -> println("Primer Trimestre")
        2 -> println("Primer Trimestre")
        3 -> println("Primer Trimestre")
        4 -> println("Primer Trimestre")
        5 -> println("Segundo Trimestre")
        6 -> println("Segundo Trimestre")
        7 -> println("Segundo Trimestre")
        8 -> println("Segundo Trimestre")
        9 -> println("Tercer Trimestre")
        10 -> println("Tercer Trimestre")
        11 -> println("Tercer Trimestre")
        12 -> println("Tercer Trimestre")
        else -> println("Trimestre invalido")
    }
}//Se puede utilizar pero no seria optimo si son opciones repetidas.

fun getTrimesterM(month: Int){
    when(month){
        1, 2, 3, 4 -> println("Primer Trimestre")
        5, 6, 7, 8 -> println("Segundo Trimestre")
        9, 10, 11, 12 -> println("Tercer Trimestre")
        else -> println("Trimestre no valido")
    }
}//Podemos resumirlo de esta manera.

fun getSemester(month: Int) {
    when (month) {
        //Con los rangos podemos definir areas muchos mas grandes para no tener que estar poniendo numero por numero
        in 1..6 -> println("Primer Semetre")
        in 7..12 -> println("Segundo Semestre")
        //else -> println("Mes ingresado invalido")
        !in 1 .. 12 -> println("Mes ingresado invalido") //Tambien podemos escribirlo de esta manera.

    }

        //Evitamos ir poniendo numero por numero hasta llegar al punto deseado.
    //when(month){
        //1, 2, 3, 4, 5, 6 -> println("Primer Semetre")
        //7, 8, 9, 10, 11, 12 -> println("Segundo Semestre")
        //else -> println("Mes ingresado invalido")
    //}
}//Podemo optimizar mejor con rangos
fun getSemesterReturn(month: Int):String{

    //Tambien podemos retornar el when cuando se produzca
    return when (month){
        in 1..6 -> "Primer Semetre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "Mes ingresado invalido"
        else -> "asfa"
    }

    //Pomos almacenar el resultado del when en una variable.
    //val result = when (month) {
    //in 1..6 -> "Primer Semetre"
    //in 7..12 -> "Segundo Semestre"
    //!in 1..12 -> "Mes ingresado invalido"
    //else -> "asfa"
    //}
    //return result
}//Con return
fun getSemesterMenosLinea(month: Int) = when (month){
    in 1..6 -> "Primer Semetre"
    in 7..12 -> "Segundo Semestre"
    !in 1..12 -> "Mes ingresado invalido"
    else -> "asfa"
    }//Retornando un semestre en menos lineas


//No es recomendable porque puede explotar
fun result(value:Any){
    //Estamos haciendo un when sobre un valor:Any(Osea puede ser cualquier valor que yo quiera[CUIDADO!})
    when(value){
        is Int -> {
            val superResult = value + value
            println(superResult)
        }
        is String -> println(value)
        is Boolean -> if(value) println("Holiwis")
    }
}

package com.diicano.andriod_master

import android.Manifest

fun main(){
    ifMultipleOr()
}

fun ifMultipleOr(){
    var pet = "jamaica"
    var imHappy = true

    if(pet == "dog" || (pet == "cat" && imHappy)){
        println("Es un gato feliz o un perro")
    }else{
        println("Es otro animal")
    }
}

fun ifMultipleAnd(){
    var age = 18
    var parentPermission = true
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("Puedes beber una cervecita")
    }
}

fun ifInt(){
    val age = 12
    if(age >= 18){
        println("Eres mayor de edad")
    }else{
        println("Eres menor de edad")
    }

}

fun ifBasico(){
    val name = "Ezequiel"

    //Si la condicion se cumple, ejecuta el codigo interno del if.
    if(name == "Ezequiel"){
        print("La variable name es Ezequiel")
    }
}

fun ifElseBasico(){
    val name = "Ezel"

    //Si el codigo no se cumple, ejecuta el else.
    if(name == "Ezequiel"){
        print("La variable name es Ezequiel")
    }else{
        print("Esta persona no es Ezequiel")
    }
}

fun ifAnidado (){
    val animal:String = "Aris"

    if(animal == "Dog"){
        println("El animal es un perrito")
    }else if(animal == "Cat"){
        println("El animal es un catito")
    }else if(animal == "Bird"){
        println("El animal es un pajarito")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun ifBoolean (){
    var soyFeliz:Boolean = true

    //El motor de por si, reconoce que es un bolean
    //if(!soyFeliz){ //Con esto queremos decir lo contrario
    if(soyFeliz){
        print("Usted es una persona feliz")
    }else{
        print("No eres feliz, consulta con un profesional.")
    }
}
package com.example.myapplication

data class Person(var name: String, var age: Int,var profession: String){

    fun getFullInfo():String{
        return name+" "+age+" "+profession
    }
}


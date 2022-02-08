package com.example.myapplication

class Factory (){
    private val  personList: ArrayList<Person>

    init {
        personList=ArrayList()
    }

    fun getPersonList():ArrayList<Person>{
        return this.personList
    }
}
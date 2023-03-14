package poo.classes

abstract class Animal {

    abstract var name: String?
    abstract var age: Int?

    open fun comunicate() {
        println("I'm a animal!")
    }
}
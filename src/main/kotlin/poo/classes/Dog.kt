package poo.classes

class Dog : Animal() {

    override var name: String? = null
        set(value) {
            field = value
        }
        get(){
            return field
        }
    override var age: Int? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }

    fun bark () {
        println("Hi! My name is $name and i'm $age years old")
    }

    override fun comunicate() {
        println("I'm a animal!")
    }
}
package poo.classes

class Application {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            var rex = Dog()
            rex.name = "Rex"
            rex.age = 5

            rex.comunicate()
            rex.bark()
        }
    }
}
/*
Polimorfismo: Permite que objetos de diferentes clases pueden ser tratados de manera uniforme
 */
fun main(){
    val dog = Dog()
    val cat = Cat()

    dog.makeSound()
    cat.makeSound()
}

open class Animal{
    open fun makeSound(){
        println("the animal makes a sound")
    }
}

class  Dog: Animal(){
    override fun makeSound() {
        super.makeSound()
        println("THE DOG MAKES A SOUND")
    }
}

class  Cat: Animal(){
    override fun makeSound() {
        println("THE CAT MAKES A SOUND")
    }
}

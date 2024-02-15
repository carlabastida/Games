/*
Encapsulamiento: Ocultar el estado interno de una clase o de un solo permite
el acceso a traves de metodos especificos
 */
fun main(){
    var person = Person()
    person.getName()
    person.setName("JUAN")
    person.setAge(10)
    println()
}

class Person(){
    private var name: String = ""
    private var age: Int = 0

    fun getName() : String{
        return  this.name
    }

    fun setName
}
/*
Abstraccion: mostrar la informacion esecencial y ocultar los detalles innecesarios
 */
fun main(){
    val circle = Circle(radius 5.0)
}

abstract class Shape{
    abstract fun calculateArea(): Double
}

class Circle(private val radius: Double):Shape(){
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val with: ReplaceWith)
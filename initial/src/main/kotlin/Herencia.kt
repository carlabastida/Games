import java.util.UUID
import kotlin.coroutines.cancellation.CancellationException

/*
Herencia: Permite la creacion de nuevas clases basadas en clases existentes
 */
/*
fun main(){
    val car = Car(brand: "Tesla", year)
}

open class Vehicle(val brand:String, val year: Int, val model: String){
    fun acelerate(){
        println("the vehicle is acelerating")
    }
    fun brake(){
        println("the card is breaking")
    }
}

class Car(brand: String, year: Int, model: String) : Vehicle(brand, year){
    fun autopilot(){
        println("auto pilot embled")
    }
}
 */

fun main(){

}

abstract class Vehicle(val wheels: Int){
    fun stop(){
        println("Stoping")
    }
    fun accelerate(){
        println("Accelerating")
    }
    fun brake(){
        println("Braking with $wheels wheels")
    }
}

abstract class  Car(val brand: String, val maxSpeed : Double, val model:String):Vehicle
private val vin : UUID.randomUUID()


class Ferrari(override val model:String) : Car()
class Motorcycle(val brand: String, val maxSpeed: Double, val model: String): Vehicle(wheels:2){
    fun wheelie(){
        println("Wheelie")
    }
}

class Factory{
    private val cars = mutableListOf<Car>()
    fun produceCar(brand: String,model: String) :Car{
        val car = when(brand){
            "Tesla" -> Tesla(model)
            "Ferrari" ->Ferrari(model)
            else -> throw  IllegalArgumentException("Brand not fund")
        }
        return car
    }

    fun produceMotorcycle()
}
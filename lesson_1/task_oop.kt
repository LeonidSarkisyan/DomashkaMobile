open class Device(val brand: String) {
    fun turnOn() {
        println("$brand: Устройство включено")
    }

    fun turnOff() {
        println("$brand: Устройство выключено")
    }
}

class Smartphone(brand: String) : Device(brand) {
    fun takePhoto() {
        println("$brand: Сделано фото")
    }
}

class Laptop(brand: String) : Device(brand) {
    fun openLid() {
        println("$brand: Крышка ноутбука открыта")
    }
}

fun main() {
    val smartphone = Smartphone("Samsung")
    smartphone.turnOn()
    smartphone.takePhoto()
    smartphone.turnOff()

    val laptop = Laptop("Apple")
    laptop.turnOn()
    laptop.openLid()
    laptop.turnOff()
}

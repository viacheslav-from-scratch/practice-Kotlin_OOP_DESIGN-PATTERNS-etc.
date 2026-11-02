package test4

fun main(){
    val lamp = Device(1, "Lamp")
    val vacuumCleaner = Device(2, "Vacuum Cleaner")

    println("id: " + lamp.id + "\nname: " + lamp.name + "\nturn: " + lamp.isOn)
    lamp.turnOff()
    println("id: " + lamp.id + "\nname: " + lamp.name + "\nturn: " + lamp.isOn)
    lamp.turnOn()
    println("id: " + lamp.id + "\nname: " + lamp.name + "\nturn: " + lamp.isOn)
    lamp.turnOn()
    println("id: " + lamp.id + "\nname: " + lamp.name + "\nturn: " + lamp.isOn)

    println("id: " + vacuumCleaner.id + "\nname: " + vacuumCleaner.name + "\nturn: " + vacuumCleaner.isOn)
}
// Task 1: Device
// - id: can't be changed after creation
// - name
// - isOn: can be READ from outside,
//         but changed ONLY through turnOn() and turnOff()
// - a new device is always off
// - calling turnOn() twice -> still on, nothing breaks (same for turnOff())
// - in main: create 2 devices, change one,
//   show that the other one didn't change
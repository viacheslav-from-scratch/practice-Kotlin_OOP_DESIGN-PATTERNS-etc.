package test5

fun main() {
    var lamp = Device(1, "Lamp")
    var printer = Device(2, "Printer")
    println(""+lamp.id+" "+lamp.name+" "+lamp.isOn)
    println(""+printer.id+" "+printer.name+" "+printer.isOn)

    var laptop = Device("Laptop")
    println(""+laptop.id+" "+laptop.name+" "+laptop.isOn)

}

// Task 1: test5
// - id: can't be changed after creation
// - name
// - isOn: can be READ from outside,
//         but changed ONLY through turnOn() and turnOff()
// - a new device is always off
// - calling turnOn() twice -> still on, nothing breaks (same for turnOff())
// - in main: create 2 devices, change one,
//   show that the other one didn't change

// Task 2: init + secondary constructor
// - add an init block to Device: it prints "Created device " + id
// - add a secondary constructor that takes ONLY name, id = 0
// - in main: create one device with the new constructor and print it
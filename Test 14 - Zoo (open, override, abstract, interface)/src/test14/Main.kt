package test14

fun main() {
    var animal = ArrayList<Animal>()
    var bird = ArrayList<Bird>()

    val dog = Dog()
    animal.add(dog)
    val puppy = Puppy()
    animal.add(puppy)
    val eagle = Eagle()
    bird.add(eagle)
    animal.add(eagle)
    val penguin = Penguin()
    bird.add(penguin)
    animal.add(penguin)



    for (i in 0..<animal.size){
        animal.get(i).introduce()
    }

    for (i in 0..<bird.size) {
        if (bird.get(i).canFly()){
            println("Bird name: \"${bird.get(i).name}\" - can fly!")
        }
    }


//    val dog = Dog()
//    val puppy = Puppy()
//    val eagle = Eagle()
//
//
//    println(animal.isEmpty())
}

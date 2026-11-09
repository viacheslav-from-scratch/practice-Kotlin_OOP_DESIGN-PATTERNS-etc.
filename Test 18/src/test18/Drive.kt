package test18

data class Drive constructor(val name: String, val licenseId: Int) {
    object Garage
    val vehicles = mutableSetOf<Vehicle>()

    fun register(v: Vehicle) {
        vehicles.add(v)
        println("register $v")
    }
}
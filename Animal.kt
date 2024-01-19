abstract class Animal(_name:String = "The Animal"): IAnimal {
    //notation for implementing interface : Iname

    val animalName = _name
    override fun move(direction:String) {
        println("$animalName moves $direction")
    }
    abstract override fun makeASound()

}
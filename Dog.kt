class Dog(_name:String="The dog"):Animal(_name) { //passes constructor of animal parent class to Dog
    override fun makeASound() {
        bark()
    }

    private fun bark() {
        println("$animalName goes woof")
    }
}
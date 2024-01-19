class Cat(_name:String="The cat"):Animal(_name) { //passes constructor of animal parent class to Cat
    override fun makeASound() {
        meow()
    }

    private fun meow() {
        println("$animalName goes meow")
    }

}
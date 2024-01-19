class Mouse(_name:String="Jerry"):Animal(_name) {
    private var cheeseAmount: Int= 0

    override fun makeASound() {
        squeak()
    }

    private fun squeak() {
        println("$animalName squeaks")
    }

    public fun stealCheese(amount:Int) {
        cheeseAmount += amount
        println("$animalName steals some cheese. They now have $cheeseAmount cheese.")
    }
    public fun eatCheese() {
        cheeseAmount--
        println("$animalName ate some cheese. They now have $cheeseAmount cheese.")
    }

}
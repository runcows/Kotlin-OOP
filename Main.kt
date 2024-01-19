//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val dog0:Animal = Dog("greg")
    moveAndMakeASound(dog0)
    val cat0:Cat = Cat("waffle")
    moveAndMakeASound(cat0)

    val mouse0:Mouse = Mouse("jerry")
    moveAndMakeASound(mouse0)

    mouse0.stealCheese(5)
    mouse0.eatCheese()
}

fun moveAndMakeASound(animal: Animal){
    animal.move("forward")
    animal.makeASound()
}

object ScalaMainObject{
    def main(args: Array[String]){
        // define classes outside the main section !!

        val rover = new Animal
        rover.setName("Rover")
        rover.setSound("wooof")
        printf("%s says %s\n", rover.getName, rover.getSound)

        val catty = new Animal("cat", "meeeww")
        println(s"${catty.getName} with id ${catty.id} says ${catty.getSound}")
        println(catty.toString)

        val pluto = new Dog("pluto", "wooooff", "grrrrrrrr")
        pluto.setName("pluto")
        println(s"${pluto.getName} with id ${pluto.id} says ${pluto.getSound}")
        println(pluto.toString)

        val wolfi = new Wolf("Wolfi")
        wolfi.moveSpeed = 36.0
        println(wolfi.move)
    }
}
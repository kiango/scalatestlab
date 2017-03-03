class Wolf ( name: String ) extends Mammal(name){

    var moveSpeed = 35.0

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

}
// abstract class can't be instantiated
// can have abstract and non - abstract methods
// Wolf is implementing Mammal

abstract class Mammal(val name : String){
    // abstract field no values assigend!
    var moveSpeed : Double

    // abstact method / no method body
    def move : String
}
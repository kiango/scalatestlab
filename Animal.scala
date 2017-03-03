
    // default constructor is defined in the class parameter
    // class parameter acts also as input
    // scala class contains all non-'static' fields and methods
    class Animal(var name: String, var sound: String){
        this.setName(name)

        // there is no static functions/variables in scala
        val id = Animal.newIdNumber

        def getName() : String = name
        def getSound() : String = sound

        def setName(name : String){
            // if name does not contain number and decimals
            if (!(name.matches(".*\\d+.*")))
             this.name = name
            else
             this.name = "NO Name"
        }

        def setSound(sound : String){
            this.sound = sound
        }

        // another constructure. 'this' is constructor inside scala
        def this(name :String){
            // calling primary constructor by 'this'
            this("No name", "No sound")
            this.setName(name)
        }

        // another constructor where not passing name and sound
        def this(){
            this("No name", "No sound")
        }

        // overriding a method
        override def toString() : String = {
            return "%s with the id %d says %s".format(this.name, this.id, this.sound)
        }

    } // Animal



    // create companion object for the Animal class where 'static' methods live
    // Call it exact name as the class (Animal)
    // companion object has full access to its class and its private fields
    object Animal{
        // create a'static field'
        private var idNumber = 0
        // create 'static' functions, adding 1 to idNumber and returning idNumber
        // methods defined in companion object can be directly called
        // without creating the object first
        private def newIdNumber = {idNumber += 1; idNumber}
    } // companion object
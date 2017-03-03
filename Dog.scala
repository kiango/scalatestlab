class Dog(name: String, sound: String, growl: String) extends Animal(name, sound){
    // constructor if sound is passed over
    def this(name: String, sound: String){
        this("no name", sound, "no growl")
        this.setName(name) // check the name according to super class
    }
    
    // constructor if name is passed over
    def this(name: String){
        this("no name", "no sound", "no growl")
        this.setName(name)
    }

    // constructor if nothing is passed
    def this(){
        this("no name", "no sound", "no growl")
        this.setName(name)
    }

    // override
    override def toString(): String = {
        return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
}
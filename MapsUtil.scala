

// maps are collection type, stores key-value pairs
// maps are immutable
object MapsUtil{
    def main(args: Array[String]){

        // create map with key: Manager, value: Bob
        val employees = Map( 
            "Manager" -> "Bob",
            "Worker" -> "Sue"
            )

        // get the value of map
        if(employees.contains("Manager"))
        printf("Manager name is: %s\n" , employees("Manager"))

        // make a mutable collection
        val customers = collection.mutable.Map( 
            100->"Paul",
            101->"Sally"
            )
        printf("Customers 1: %s\n", customers(100))

        // replace customer 100 to:
        customers(100) = "Tom"
        // add new customer
        customers(102) = "Megan"

        for((k,v) <- customers)
        printf("%d : %s\n", k, v)

    }
}

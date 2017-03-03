import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

object ArrayUtil{

    def main(args: Array[String]){

        // array
        val favoritNums = new Array[Int](20)
        val friends = Array("bob","tom")
        friends(0) = "john"


        // array buffer
        val newFriends = ArrayBuffer[String]()
        newFriends.insert(0, "phil")
        newFriends += "mark"
        newFriends ++= Array("susy", "paul")
        newFriends.insert(1, "a", "b", "c", "d")
        newFriends.remove(1,2) // remove 2 element from index 1

        for ( friends <- newFriends ) {
        println(friends)
        }

        // fill an array
        for ( j<-0 to favoritNums.length-1 ){
            favoritNums(j) = j
            println(favoritNums(j))
        }

        // perform multiple calculation using yield
        val favNumsTimes2 = for(num <- favoritNums) yield 2 * num
        // prints the value from above yield
        favNumsTimes2.foreach(println)

        // print values only evenly divisible by 4
        var favNumsDiv4 = for(num <- favoritNums if num % 4 == 0 ) yield num
        favNumsDiv4.foreach(println)

        // multi dimensional array application
        var multi2D = Array.ofDim[Int](10,10)
        for(i <- 0 to 9){
            for(j <- 0 to 9){
                multi2D(i)(j) = i*j
            }
        }
        // print the 2D Array
        for(i <- 0 to 9){
            for(j <- 0 to 9){
                printf("[%d , %d] = %d\n", i, j, multi2D(i)(j))
            }
        }

        // some array functions
        println("Sum: " + favoritNums.sum)
        println("Min: " + favoritNums.min)
        println("Max: " + favoritNums.max)
        
        // sort the array in decending order (accending order change '<')
        val sortNums = favoritNums.sortWith(_>_)
        println(sortNums.deep.mkString(", "))

    }
}
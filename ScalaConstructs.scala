
object ScalaConstructs{
 def main(args: Array[String]){
  var myName = " - test me name !"
  var i : Int = 0
/*
  while(i<=10) {
   println(i + myName) 
   i += 1
   }

  do {
   println(i + "  do while loop")
   i += 1
  } while (i<=10)
*/

  for (i <- 1 to 10)
   println(i + " comming from for loop")

  // loop string
  val randLetters = "kjhwoeu29823ranvjkfafl092u74tkjaq"
  val randLetttersLen = randLetters.length();
  for ( i<-0 until randLetttersLen)
   println(randLetters(i))

  // loop list
  val aList = List(1,2,3,4,5,6)
  for ( i<- aList)
   println("we are from aList: " + i)

  // create a list of even numbers
  var evenList = for { 
   i<-1 to 20 if ( i%2 ) == 0 
   } yield i // stores the result in the evenList
  
  for (i<-evenList) println(i)

  // loop with 2 iterators
  for ( i<-0 to 5; j<-6 to 18 ){
   println( "i " + i )
   println( "j " + j )
  }

 // print some prime numbers
 def printPrimes(){
  val primeList = List(1,2,3,5,7,11,13)
  for ( i<-primeList){
   if ( i==11 )
   return
   else {println( i + " it is me !")}

   if ( i==1 ){
   println( i + " i was called first ")
   return // it terminates the loop
   }
  // function call
   }
 }
 printPrimes

 }
}



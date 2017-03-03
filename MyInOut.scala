import scala.io.StdIn.{readLine,readInt}
import scala.io.Source
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter


object MyInOut{
 def main(args: Array[String]){

  // Input output

  var str = "lets do battle"
  println("3rd index: " + str(3) + " String length: " + str.length())
  val strArray = str.toArray
  for (i<-strArray) println(i)

  println("Guess a number ...")
  var numberGuess = 0
   numberGuess = readLine.toInt
  do {
   print("Guess number from 0 to 20 ... ")
   numberGuess = readLine.toInt
  } while( numberGuess != 15 )
  println(s"you guessed: $numberGuess")
  println(f"multi 10: ${numberGuess*10}")
  printf("You guessed the secret number %d\n", 15)
  printf("'%5d'\n", 15) // left justyfied
  printf("'%-5d'\n", 15) // right justyfied
  printf("'%.5f'\n", 15.0) // decimal truncation
  printf("'%-5s'\n", "You guessed") // spaces!




  // styling characters in printxx methods: 
  // %c charachter, d% different integertypes
  // %f floating points, %s strings


 } // End main
} // End object

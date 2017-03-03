import scala.annotation.tailrec
import scala.io.StdIn.{readLine,readInt}
import scala.io.Source
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter


object MyFun{
 def main(args: Array[String]){

 // about functions
 // def functionName(param1:type, param2:type){
 // function body
 // return value} return is not mandatory!


  // function with param num, type Int, 
  // return type Int is already defined after param
  def getSum( num1:Int = 1, num2:Int = 3 ) : Int = {
  return num1 + num2
  }
  println(getSum()) // outputs 4
  println(getSum(5,5))


 // void function > use Uni, means no return values
 def sayHi() : Unit = {
 println("Hi Ola Niha")
 }
 sayHi() // function call


 // variable number of input of arguments
 def getSum2( args: Int* ) : Int = {
 var sum : Int = 0
 for ( i<-args ){ sum += i }
 sum // return value
 }
 // call
 println("get sum: " + getSum2(2,4,6,9,1))


 // recursive calculation of factorial
 def factorial( num:BigInt ) : BigInt = {
  if (num<=1)
   1
  else
   num * factorial(num-1)

  num // return type not mandatory!
 }
 // call
 println("factorial of 4 = " + factorial(4))





 } // End main
} // End object

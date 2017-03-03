import scala.annotation.tailrec

object Functions{

    def main(args: Array[String]){

        // accepts many ints as parameters
        def getSum(args : Int*) : Int = {
            var sum : Int = 0
            for ( num <- args ){
                sum += num
            }
            sum
        }
        // call
        println("get sum: " + getSum(1,2,3,4,5))



        // recursive factorial calculation
        def factorial( num : BigInt) : BigInt = {
            if (num <= 1) 1
            else factorial( num-1) * num
        }


        // tail recursive factorial calculation
        def factorial_tail( num : Int) = {
            @annotation.tailrec
            def looper( num : Int, r : Int ) : Int =
                if (num <= 1) r
                else looper( num-1, num*r)
            looper( num, 1 )
        }

        // call
        println("factorial of 5: " + factorial(5))
        println("factorial tail of 5: " + factorial_tail(5))

    }
}
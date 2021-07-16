object recursion extends App{

  //Question1
      def gcd(x:Int,y:Int):Int=y match{
        case 0 => x
        case y if (y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
      }
      def prime(p:Int,n:Int=2):Boolean=n match{
        case x if (p==x)=> true
        case x if (gcd(p,x)>1)=> false
        case x =>prime(p,x+1)
      }
      println("Question1")
      println("Whether a number is prime")
      println(prime(11))
      println(prime(8))

  //Question2

    def primeSeq(n:Int, p:Int=2): Any ={
     if(n>=p)
     {if(prime(p)) println(p);
      primeSeq(n,p+1)};
     }
     println("/nQuestion2")
     println("Prints all prime numbers less than n")
     println(primeSeq(11))

  //Question3

     def sum(n:Int):Int= if(n==1) 1 else n+sum(n-1)
     println("/nQuestion3")
     println("Addition of numbers from 1 to n")
     println(sum(11))

  //Question4

     def isEven (n:Int) : Boolean = n match{
     case 0 =>true
     case_ => isOdd(n-1)
     }
     def isOdd (n:Int) : Boolean = !(isEven(n))
     
     println("/nQuestion4")
     println("Whether even or odd")
     println(isEven(11))
     println(isEven(10))
     println(isOdd(11))
     println(isOdd(10))

  //Question5

     def add(n:Int):Int = {
      if(n%2 == 0) addEven(n-2)
      else addEven(n-1)
     }

     def addEven(n:Int):Int =n match {
       case 0=> 0
       case 1=> 0
       case n if(n>0)=>(n + addEven(n-2))
     }
     println("/nQuestion5")
     println("Addition of even numbers upto n")
     println(addEven(11))

   //Question6

    def fibonacci(n:Int):Int= n match{
     case 0 => 0
     case 1 => 1
     case n => fibonacci(n-1)+fibonacci(n-2)
     }
    def fibonacci_sequence(num:Int): Unit ={
     if(num>0) fibonacci_sequence(num-1);
     println(fibonacci(num));
     }

     println("/nQuestion6")
     println("Print first n Fibonacci numbers")
     println(fibonacci_sequence(11))
}
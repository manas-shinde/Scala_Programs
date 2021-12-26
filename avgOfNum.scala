/*import java.util.Scanner;

object avgOfNum {
  def main(args:Array[String]):Unit={ 
       
        val scanner = new Scanner(System.in)
   
        println("Enter First No : ")
        val a = scanner.nextInt()
        println("Enter Second No : ")
        val b = scanner.nextInt()
        
         var n = b-a;
         var sum = 0;
         
         for(i<- (a+1).to(b-1)){
            sum += i;
         }
        
         val avg = sum / n;
         println(s"Avg of all numbers between $a and $b is  $avg");
         

  }
}*/

import java.util.Scanner;

  class avgOfNum{
     def calaulate(x:Int,y:Int):Int={
     var sum = 0;
     for(i<- (x+1).to(y-1)){//find to numbers between a and b
            sum += i;
       }
       var n = y-x;
    println(n+" "+sum);
      var  avg = sum / n;
     return avg;
  
    }
  }
  object main{
    def main(args:Array[String]):Unit={ 
       
        val obj = new avgOfNum;
        val scanner = new Scanner(System.in)
   
        println("Enter First No : ")
        val a = scanner.nextInt()
        println("Enter Second No : ")
        val b = scanner.nextInt()
        
       
      
        if(a>b){
            println("Avg of number between "+ a + " and  "+b+ " is  "+obj.calaulate(b,a));
        }else{
            println("Avg of number between "+ a + " and  "+b+ " is  "+obj.calaulate(a,b));
         }
  }
 
}
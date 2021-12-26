import java.util.Scanner;

class factorila(n:Int){
    def calculateFactorila(){
        var fact = 1;
        for(i<- 1.to(n)){
            fact = fact * i;
        }
        println(s"Factorial of Number $n is $fact");
    }
}
object main{
    def main(args:Array[String]){
        val scanner = new Scanner(System.in);

        println("Enter Number:");
        val num = scanner.nextInt();

        val obj = new factorila(num);
        
        obj.calculateFactorila();
    }
}
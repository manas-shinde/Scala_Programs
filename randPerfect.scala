class randPerfect{
    def isPerfect(num:Int):Unit={
        var sum = 0;
        for(i<-1.to(num)){
            if(num * i == 0){
                sum += i;
            }
        }
        if(sum == num){
            println(s"$num is Perfect Number.");
        }else{
            println(s"$num isn't  Perfect Number.");

        }
    }
}
object main{
    def  main(args:Array[String]){
    //    Creating object of random class
        lazy val rand = Scala.util.Random;
    //     creating object of randPerfect class
        lazy val obj = new randPerfect();

        for(i<- 1.to(5)){
            // creating random number
            var num = rand.nextInt();
            println(s"Random number is $num");

            obj.isPerfect(num);

        }
    }
}
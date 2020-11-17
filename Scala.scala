import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var sum:Double = 0
    var count = 0
    for (i <- 1 to 6){
        var a = input.nextDouble();
        if(a > 0){
            count = count + 1
            sum = sum + a
        }
    }
    println(f"$count valores positivos")
    println("%.1f".format(sum / count))
    }
}

 

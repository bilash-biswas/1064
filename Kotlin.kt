import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a:Double;
    var sum:Double;
    var count:Int;
    sum = 0.0
    count = 0
    for (i in 1..6){
        a = read.nextDouble();
        if(a > 0){
            count = count + 1
            sum = sum + a
        }
    }
    println("$count valores positivos")
    println("%.1f".format(sum / count))
}

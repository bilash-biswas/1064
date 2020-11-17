using System.IO;
using System;

class Program
{
    static void Main()
    {
    double a,sum = 0;
    int i,s = 0;
    for(i = 1;i <= 6;i++){
        a = Convert.ToDouble(Console.ReadLine());
        if(a > 0){
            s++;
            sum = sum + a;
        }
    }
    Console.WriteLine(s + " valores positivos");
    Console.WriteLine(string.Format("{0:0.0}",(sum / s)));
    Console.ReadLine();
  }
}

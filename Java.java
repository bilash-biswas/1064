import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] A = new double[7];
    int count = 0,i;
    double sum = 0;
    for(i = 1;i <= 6;i++)
    {
        A[i] = input.nextDouble();
    }
    for(i = 1;i <= 6;i++)
    {
    if(A[i] > 0)
    {
        count = count + 1;
        sum = sum + A[i];
    }
    }
    System.out.printf("%d valores positivos\n", count);
    System.out.printf("%.1f\n",sum / count);
  }  
}

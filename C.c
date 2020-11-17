#include<stdio.h>
int main()
{
    int i,count = 0,j;
    double a[7],sum = 0,z;
    for(i = 1;i <= 6;i++)
    {
     scanf("%lf",&a[i]);
    }
    for(j = 1,i = 1;j <= 6,i <= 6;j++,i++)
    {

     if((a[i]) > 0)
     {
         count = count + 1;
         sum = sum + a[i];
     }
    }
    z = sum / count;
    printf("%d valores positivos\n", count);
    printf("%.1lf\n", z);
    return 0;
}

#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    double a[10],s = 0;
    int i,p = 0;
    for(i = 1;i <= 6;i++){
        cin>>a[i];
        if(a[i] > 0){
            s = s + a[i];
            p++;
        }
    }
    cout<<p<<" valores positivos"<<endl;
    cout<<fixed<<setprecision(1)<<(s/p)<<endl;
    return 0;
}

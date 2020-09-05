#include<iostream>
using namespace std;
int main(){
    int month,i;
    cin>>month;
    int m1=0, m2=1,sum=0;
    for(i=0;i<month;i++){
        if(i==0){
            i=m1;
        }
        if(i==1){
            i=m2;
        }
        if(i>1){
            sum = m1+m2;
            m1 = m2;
            m2 = sum;
        }
    }
    cout<<sum;
    return 0;
}

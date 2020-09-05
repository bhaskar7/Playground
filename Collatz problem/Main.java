#include<iostream>
using namespace std;
int main(){
    int num,count=0;
    cin>>num;
    cout<<num<<endl;
    while(num!=1){
      	count++;
        if(num%2==0){
            num = num/2;
        }else{ 
            num = num*3+1;
        }
        cout<<num<<endl;
    }
  	cout<<count;
    return 0;
}
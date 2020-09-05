#include<iostream>
using namespace std;
int main(){
  int no,sum = 0,sum1=0;
  cin>>no;
  while(no!=0){
    sum += no%10;
    no/=10;
  }
   while(sum!=0){
    sum1 += sum%10;
    sum/=10;
  }
  cout<<sum1;
  return 0;
}
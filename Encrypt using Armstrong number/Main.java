#include<iostream>
#include<cmath>
int armstrong (int);
using namespace std;
int main(){
  int no;
  cin>>no;
  int result = armstrong (no);
  if(result == no){
    cout<<"Kindly proceed with encrypting";
  }else{
     cout<<"It is not an Armstrong number";
  }
  return 0;
}
int armstrong (int no){
  int base = no,count=0,sum=0,digit;
  while(no!=0){
    count++;
    no/=10;
  }
  for(int i=1;i<=count;i++){
    digit = base%10;
    sum+=pow(digit,count);
    base/=10;
  }
  return sum;
}
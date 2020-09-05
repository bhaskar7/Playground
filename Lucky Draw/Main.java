#include<iostream>
using namespace std;
int main(){
  int no,count,i;
  cin>>no;
  if(no==0 || no==1){
    count = 1;
  }
  for(i=2;i<=no/2;i++){
    if(no%i==0){
      count = 1;
      break;
    }
  }
  if(count==1){
    cout<<"Not eligible";
  }else{
    cout<<"Eligible";
  }
  return 0;
}
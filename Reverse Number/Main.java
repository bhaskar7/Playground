#include<iostream>
using namespace std;
int main(){
  int no,sum;
  cin>>no;
  while(no>0){
  sum = no%10;
  no = no/10;
    cout<<sum;
  }
  
  return 0;
}
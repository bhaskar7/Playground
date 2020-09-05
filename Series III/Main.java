#include<iostream>
using namespace std;
int main(){
  int no,sum=0;
  cin>>no;
  int initial = 6;
  cout<<initial<<" ";
  for(int i=1;i<no;i++){
    if(i==1){
    sum +=(5*i)+6;
    cout<<sum<<" ";
    }else{
      sum += 5*i;
      cout<<sum<<" ";
    }
  }
  return 0;
}
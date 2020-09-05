#include<iostream>
using namespace std;
int main()
{
  int bill;
  cin>>bill;
  if(bill<=200){
    cout<<"Rs."<<int(0.5*bill);
  }else if(bill<=400){
    cout<<"Rs."<<0.65*bill+100;
  }else if(bill<=600){
    cout<<"Rs."<<0.80*bill+200;
  }else{
    cout<<"Rs."<<1.25*bill+425;
  }
  return 0;
}
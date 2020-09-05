#include<iostream>
using namespace std;
int main()
{
int F_amount,F_discount,F_charge,S_amount,S_discount,S_charge,A_amount,A_discount,A_charge;
cin>>F_amount>>F_discount>>F_charge>>S_amount>>S_discount>>S_charge>>A_amount>>A_discount>>A_charge;
   int x = (F_amount*(100-F_discount)*0.01);
   int y = (S_amount*(100-S_discount)*0.01);
   int z = (A_amount*(100-A_discount)*0.01);
cout<<"In Flipkart Rs."<<x+F_charge<<endl;
cout<<"In Snapdeal Rs."<<y+S_charge<<endl;
cout<<"In Amazon Rs."<<z+A_charge<<endl;
  if(x<y && x<z){
    cout<<"He will prefer Flipkart";
  }else if(y<z && y<x){
    cout<<"He will prefer Snapdeal";
  }else{
    cout<<"He will prefer Amazon";
  }
  return 0;
}
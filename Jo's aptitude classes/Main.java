#include <iostream>
using namespace std;
int main() 
{
  int no1,no2,no3,gcd,flag;
  cin>>no1>>no2>>no3>>gcd;
  if(no1 == gcd){
    cout<<"Answer is correct.";
  }else{
    cout<<"Answer is wrong.";
  }
    return 0;
}
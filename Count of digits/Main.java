#include<iostream>
using namespace std;
int main()
{
  int no,count=0,digit;
  cin>>no;
  do{
    digit = no%10;
    no = no/10;
    count++;
  }
  while(no>0);
  cout<<count;
  return 0;
}
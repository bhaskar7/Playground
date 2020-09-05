#include<iostream>
using namespace std;
int main()
{
  int no,c1,c2,i,sum=0;
 cin>>no;
  c1 = 0;
  c2 = 1;
  for(i=1;i<=no-2;i++){
    sum = c1+c2;
    c1 = c2;
    c2 = sum;
  }
  cout<<"The term "<<no<<" in the fibonacci series is "<<sum;
  return 0;
}
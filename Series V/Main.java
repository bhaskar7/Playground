#include<iostream>
using namespace std;
int main()
{
  int no,sum=0;
  cin>>no;
  int initial = 11;
  //cout<<initial<<" ";
  for(int i=1;i<=no;i++){
    sum = initial*initial;
    cout<<sum<<" ";
    initial+=4;
  }
  return 0;
}
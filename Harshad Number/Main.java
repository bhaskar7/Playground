#include<iostream>
using namespace std;
int main()
{
 int no,sum=0;
  cin>>no;
  int no1 = no;
  while(no>0){
    sum +=no%10;
    no /=10;
  }
  no1%sum==0?cout<<"Harshad Number":cout<<"Not Harshad Number";
  return 0;
}
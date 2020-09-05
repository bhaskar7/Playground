#include<iostream>
using namespace std;
int main()
{
  int year;
  cin>>year;
  year%4==0?cout<<year<<" is a leap year":cout<<year<<" is not a leap year";
 return 0;
}
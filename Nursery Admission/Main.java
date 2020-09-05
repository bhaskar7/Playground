#include<iostream>
#include<string>
using namespace std;
int main()
{
 string str;
  getline(cin,str);
  int x = str.length();
  cout<<"The number of letters in the name is "<<x;
  return 0;
}
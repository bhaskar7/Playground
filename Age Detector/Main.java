#include<iostream>
using namespace std;
int main()
{
  int past,present;
  cin>>past>>present;
  if(past>present)
  	cout<<(2000+present)-(1900+past);
  else
    cout<<(2000+present)-(2000+past);
  return 0;
}
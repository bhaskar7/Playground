#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  string userstr;
  cin>>userstr;
  int* myarray = new int[sizeof(userstr)]; 
  for(int i=0;i<userstr.length();i++){
    myarray[i] = userstr[i] - '0';
	}
  
  cout<<myarray[0]+myarray[userstr.length()-1];
}
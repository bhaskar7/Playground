#include<iostream>
using namespace std;
int rec(int);
int main()
{
	int no;
  	cin>>no;
  	int x = rec(no);
  	cout<<"The factorial of "<<no<<" is "<<x;
  	return 0;
}
int rec (int no){
  int count=1;
  if(no==0);
  else{
    count*=rec(no-1)*no;
  }
  return count;
}
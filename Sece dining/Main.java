#include<iostream>
using namespace std;
int main()
{
  string  s;
  int i;
  cin>>s>>i;
 	if(s == "front"){
      if(i==1){
        	cout<<"Left Handed";
      	}else{
       		cout<<"Right Handed";
      	}
    }else{
        if(i==1){
          cout<<"Right Handed";
        }else{
          cout<<"Left Handed";
        }
      }
  return 0;
}
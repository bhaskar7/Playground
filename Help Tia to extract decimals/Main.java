#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum;
	getline(cin,fnum);
	int x = fnum.find(".");
	//cout<<x<<endl;
  	if(x!=-1){
      cout<<"Floating part is : ";
  	    for(int i = x+1;i<fnum.length();i++){
            cout<<fnum.at(i);
  	    }
    }else{
      cout<<"Floating part is : ";
    }
  return 0;
}
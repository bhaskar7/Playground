#include<iostream>
using namespace std;
int main(){
  int no,output;
  cin>>no;
  int number = 11;
  for(int i=1;i<=no;i++){
    output = number*number;
    cout<<output<<" ";
    number+=4;
  }
  return 0;
}
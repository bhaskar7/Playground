#include<iostream>
using namespace std;
int main(){
  int start,end,i,count,j;
  cin>>start>>end;
  for(i=start;i<end;i++){
    count = 0 ;
    for(j=1;j<i;j++){
      if(i%j==0)
      count=count+j;
    }
    if(i==count){
    	cout<<count<<" ";
    }
  }
  //return 0;
}
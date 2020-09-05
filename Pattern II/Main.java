#include<iostream>
using namespace std;
int main(){
  int no,var1=1,var2,i,j;
  cin>>no;
  for(i=1;i<=no;i++){
    if(i%2!=0){
      var1+=i-1;
      for(j=1;j<=i;j++){
        if(j==1){
          cout<<var1;
        }else{
          cout<<"*"<<var1;
        }
        var1++;
      }
    }
    if(i%2==0){
      	var2 = var1+i-1;
         for(j=1;j<=i;j++){
        if(j==1){
          cout<<var2;
        }else{
          cout<<"*"<<var2;
        }
        var2--;
      }
    }
    cout<<endl;
  }
  return 0;
}
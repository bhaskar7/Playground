#include<bits/stdc++.h> 
using namespace std;
int main()
{
  float item,time;
  cin>>item>>time;
  if(item==2){
    float x = (time*50)/100;
    cout<<fixed<<setprecision(2)<<(float)time+x;
  }else if(item==3){
    cout<<fixed<<setprecision(2)<<(float)time*2;
  }else{
    cout<<"Number of items is more";
  }
  return 0;
}
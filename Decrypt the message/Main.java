#include<iostream>
using namespace std;
int main(){
  int m_digit,t_digit,sum,i, count=0;
  cin>>m_digit>>t_digit;
  sum = m_digit+t_digit;
  for(i=1;i<=sum/2;i++){
    if(sum%i==0){
      count+=i;
    };
  }
  count==sum?cout<<"They can read the message":cout<<"They can't read the message";
  return 0;
}
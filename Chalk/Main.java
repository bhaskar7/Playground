#include<iostream>
#include<math.h>
using namespace std;
int main(){
  int n,i;
  float count=0.00,ans;
  cin>>n;
  float sqr_root =(1/sqrt(n));
  for(i=0;i<n;i++)count = count+sqr_root;
  	int days = int(count);
    ans = n+days;
    cout<<ans+1;
  return 0 ;
}

#include<iostream>
using namespace std;
int main()
{
  int no,i,r_no,flag;
  //cout<<"no"<<endl;
  cin>>no;
  int arr[no];
  //cout<<"array"<<endl;
  for(i=0;i<no;i++){
    cin>>arr[i];
  }
  cin>>r_no;
  //cout<<r_no<<" ";
  for(i=0;i<no;i++){
    if(r_no==arr[i]){
      flag=1;
      break;
    }
  }
  if(flag == 1)
  	cout<<"She passed her exam";
  else
    cout<<"She failed";
  return 0;
}
#include<iostream>
using namespace std;
int main()
{
  int no,i;
  cin>>no;
  int arr[no];
  int max = 0 ; 
  for(i=1;i<=no;i++){
    cin>>arr[i];
    }
  for(i=1;i<=no;i++){
    if(max<arr[i]){
     max = arr[i];
  	}
  }
	cout<<max<<" ";
  return 0;
}
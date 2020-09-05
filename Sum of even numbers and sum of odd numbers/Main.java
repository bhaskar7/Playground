#include<iostream>
using namespace std;
int main()
{
	int no,sum1=0,sum2=0,i;
  	cin>>no;
  	int arr[no];
  	for(i=1;i<=no;i++){
      cin>>arr[i];
    }
  	for(i=1;i<=no;i++){
     	if(arr[i]%2==0){
          sum1 +=arr[i]; 
        }else{
          sum2+=arr[i];
        }
    }
  cout<<"The sum of the even numbers in the array is "<<sum1<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum2;
  return 0;
}
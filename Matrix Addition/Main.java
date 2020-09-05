#include<iostream>
using namespace std;
int main()
{
	int row,column,i,j;
  	cin>>row>>column;
  	int arr1[row][column],arr2[row][column],sum[row][column];
  	for(i=1;i<=row;i++){
      for(j=1;j<=column;j++){
        cin>>arr1[i][j];
      }
    }
  	 for(i=1;i<=row;i++){
      	for(j=1;j<=column;j++){
        	cin>>arr2[i][j];
      	}
    } 
  	 for(i=1;i<=row;i++){
      	for(j=1;j<=column;j++){
        	sum[i][j] = arr2[i][j] + arr1[i][j];
          	cout<<sum[i][j]<<" ";
      	}
       cout<<endl;
    }
  return 0;
}
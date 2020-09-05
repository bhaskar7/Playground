#include<iostream>
using namespace std;
int main()
{
	int row,column,max=0,i,j;
  	cin>>row>>column;
  	int arr[row][column];
  	for(i=1;i<=row;i++){
      for(j=1;j<=column;j++){
        cin>>arr[i][j];
      }
    }
    for(i=1;i<=column;i++){
      //max = 0;
      for(j=1;j<=row;j++){
        if(max<=arr[j][i]){
          max = arr[j][i];
        }
      }
    }
    cout<<"The maximum element is "<<max<<endl;
  return 0;
}

#include<iostream>
using namespace std;
int main()
{
	int r,c,i,j;
 	cin>>r>>c;
  	int arr1[r][c] , arr2[r][c] , sum[r][c];
  	for(i=1;i<=r;i++){
      for(j=1;j<=c;j++){
        cin>>arr1[i][j];
      }
    }
  for(i=1;i<=r;i++){
      for(j=1;j<=c;j++){
        cin>>arr2[i][j];
      }
    }
  for(i=1;i<=r;i++){
      for(j=1;j<=c;j++){
        sum[i][j] = arr1[i][j] + arr2[i][j];
        cout<<sum[i][j]<<" ";
      }
    cout<<endl;
    }
  
 	return 0;
}
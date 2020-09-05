#include<iostream>
using namespace std;
int main(){
    int no,i,j,k;
    cin>>no;
    int no1 = no;
    for(i=1;i<=no;i++){
        for(j=1;j<=i;j++){
            if(j==1)
                cout<<i;
            else
                cout<<"*"<<i;
        }
        cout<<endl;
    }
    for(i=no1;i>=1;i--){
        for(j=1;j<=i;j++){
            if(j==1)
                cout<<i;
            else
                cout<<"*"<<i;
        }
        cout<<endl;
    }
    
    return 0;
}
#include<iostream>
using namespace std;
int main(){
    int no,i,j,x;
    cin>>no;
    for(i=1;i<=no;i++){
        x = i;
        if(x%2!=0){
            for(j=1;j<=no;j++){
                if(j!=no){
                    cout<<x;
                }else{
                    cout<<x+1;
                }
            }
        }
        //cout<<endl;
        if(x%2==0){
            for(j=1;j<=no;j++){
                if(j==1){
                    //x+2;
                    cout<<x+1;
                }else{
                    cout<<x;
                }
            }
        }
        cout<<endl;
    }
    return 0;
}
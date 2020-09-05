#include<iostream>
using namespace std;
int main(){
    int no,i;
    cin>>no;
    float x = 0.5;
    cout<<x<<" ";
    for(i=2;i<=no;i++){
        x *=3;
        cout<<x<<" ";
    }
    return 0;
}
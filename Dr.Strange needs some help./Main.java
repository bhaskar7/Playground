#include<iostream>
using namespace std;
int experiment (int,int,int);
int main(){
  int m,n,req;
  cin>>m>>n>>req;
  int s = experiment(m,n,req);
  if(s==0){
  	cout<<"Doctor, you can proceed with your experiment.";  
  }else{
  	cout<<"Sorry Doctor! You need more bacteria."; 
  }
  return 0;
}

int experiment(int m,int n,int req){
  int mul = m*n;
  if(req-mul<3){
    return 0;
  }
}
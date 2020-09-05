#include<iostream>
using namespace std;
int swap(int,int);
int main(){
  int no1,no2;
  cin>>no1>>no2;
  cout<<"Before swapping a= "<<no1<<" and b="<<no2<<endl;
  swap(no1,no2);
  return 0;
}
int swap (int no1 , int no2){
   int temp;
  temp = no1;
  no1 = no2;
  no2 = temp;
  cout<<"After swapping a= "<<no1<<" and b="<<no2;
  return 0;
}
#include <iostream>
#include<bits/stdc++.h> 
using namespace std;

int main() {
  
  string s1,s2;
  getline(cin,s1);
  getline(cin,s2);
  reverse(s1.begin(),s1.end());
  if(s1==s2){
    cout<<"It is correct";
  }else{
  	cout<<"It is wrong";
  }
  return 0;
}
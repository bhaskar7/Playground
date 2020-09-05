#include<iostream>
using namespace std;
int main()
{
  string s,s1;
  int i;
  getline(cin,s);
  s1 = s;
  for(i=0;i<=s.length();i++){
    if((s[i]>='a' && s[i]<='z')||(s[i]>='A' && s[i] <= 'Z')){
        cout<<s[i];
    }else{
      continue;
    }
  }
  return 0;
}
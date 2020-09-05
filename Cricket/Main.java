#include<iostream>
#include <iomanip> 
using namespace std;
int main()
{
  int ball,run,run_score,ball_boweld;
  cin>>ball>>run>>run_score>>ball_boweld;
  float x = ball/6;
  cout<<x<<endl;
  float y = ball_boweld/6+(ball_boweld%6)*0.1;
  cout<<y<<endl;
  float rr = run_score/y;
  cout<<fixed<<setprecision(1)<<rr<<endl;
  float a = float(run/x);
  cout<<a<<endl;
  rr>a?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  return 0;
}
#include<stdio.h>
int main()
{
  //fill your code
  int a,b;
  scanf("%d %d",&a,&b);
  if(a==75)
    printf("You are normal. Go walking daily and maintain it.");
  else if(a==100)
    printf("You are underweight. Have an apple daily.");
  else
    printf("You are obese. Go to doctor");
  return 0;   
}
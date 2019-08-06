#include<stdio.h>
int main()
{
  //fill your code
  int a,b,x;
  scanf("%d%d",&b,&a);
  if(a%4==0 || a%100!=0 && a%400==0)
    x=29;
  else
    x=28;
  switch(b)
  {
    case 3: printf("Number of days is 31");
      break;
    case 2: printf("Number of days is %d",x);
      break;
    default:printf("hello world");
  }
  return 0;
}
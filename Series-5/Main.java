#include<stdio.h>
int main()
{
  //Fill your code
  int a=2,b,c,i;
  scanf("%d",&b);
  for(i=0;i<b;i++)
  {
    printf("%d ",a);
    a=((a*2)-i);
  }
  return 0;
}
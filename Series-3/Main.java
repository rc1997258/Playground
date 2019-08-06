#include<stdio.h>
int main()
{
  //Fill your code
  int a=6,b,i,c=3;
  printf("Enter n value\n");
  scanf("%d",&b);
  for(i=0;i<b;i++)
  {
    printf("%d ",a);
    a=a+c;
    c=c+2;
  }
  return 0;
}
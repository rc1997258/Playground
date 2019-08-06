#include<stdio.h>
int main()
{
  //Fill your code      
  int a=0,c=3,b,i;
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
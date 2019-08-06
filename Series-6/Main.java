#include<stdio.h>
int main()
{
  //Fill your code
  int a,i,c;
  scanf("%d",&a);
  printf("Enter n value\n");
  for(i=1;i<=a;i++)
  {
    c=pow(i,i);
    printf("%d ",c);
  }
}
#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,i;
  printf("Enter n value\n");
  scanf("%d",&a);
  for(i=0;i<a;i++)
  {
    b=b+2*i;
    printf("%d ",b);
  }
  return 0;
}
#include<stdio.h>
int main()
{
  //Fill your code
  int a,b[20],i,c=1;
  printf("Enter n value\n");
  scanf("%d",&a);
  b[0]=1;
  b[1]=1;
  for(i=0;i<a;i++)
  {
    printf("%d ",b[i+1]);
    b[i+2]=b[i]+b[i+1];
  }
  return 0;
}
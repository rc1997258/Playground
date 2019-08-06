#include<stdio.h>
int main()
{
  //Fill your code
  int a,b=10,c=5,d[20],i;
  scanf("%d",&a);
  printf("Enter n value\n");
  d[0]=10;
  d[1]=5;
  for(i=0;i<a;i++)
  {
    if(i%2==0)
    {
      d[i+2]=d[i]+50;
      printf("%d ",d[i]);
    }
    else
    {
      printf("%d ",d[i]);
      d[i+2]=d[i]+10;
    }
  }
 return 0; 
}
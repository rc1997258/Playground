#include<stdio.h>
int main()
{
  //fill your code
  int a=7,b=5,c,i;
  scanf("%d",&c);
  for(i=0;i<c;i++)
  {
    if(i%2==0)
    {   printf("%d ",a);
      a++;
    }
    else
    {
      printf("%d ",b);
      b++;
    }
    
  }
  return 0;
}
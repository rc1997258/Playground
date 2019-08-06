#include<stdio.h>
#include<math.h>
int main()
{  
  int a,i,j=101,k;
  scanf("%d",&a);
  for(i=0;i<a;i++)
  {
      for(k=2;k<=j/2;k++)
      {
        if(j%k==0)  
        {
          j=j+1;
          k=2;
        }
      }
          printf("%d ",j);
        j++;
      }
}
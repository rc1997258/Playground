#include<stdio.h>
int main()
{
  //fill 
  int a,b,c,d,e,f,i,j,n;
  scanf("%d%d%d",&a,&b,&c);
  int number[2];
  number[0]=a;
  number[1]=b;
  number[2]=c;
  n=3;
  
  for(i=0;i<2;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if (number[i] > number[j]) 
                {
 
                    e =  number[i];
                    number[i] = number[j];
                    number[j] = e;
 
                }
      
    }
  }
 printf("The treasure is in the box which has number %d.\n",number[1]);
if(number[0]==2)
  printf("The code to open the box is 2.");
else
  printf("The code to open the box is 7.");
    

}

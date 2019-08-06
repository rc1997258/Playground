#include<stdio.h>
int main()
{
  //Fill your code
  int a,i;
  scanf("%d",&a);
  printf("Enter n value");
 for(i=1;i<=a;i++)
 {
   if(i%2==0)
     printf("%d ",(i*i));
    if(i%2!=0)
       printf("%d ",(i*i*i));  
 }
  return 0;
}
#include<stdio.h>
int main()
{
  //fill your code
  int c,a[20],i=0;
  scanf("%d",&a[0]);
  while((a[i])>0)
  {
    c=c+a[i];
    i++;
    scanf("%d",&a[i]);
  }
 printf("%d",c);
  return 0;
}
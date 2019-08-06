#include<stdio.h>
int main()
{
  //Fill your code
  int a,b,c,d,e;
  char s[20];
  scanf("%s",&s);
  scanf("%d %d %d",&a,&b,&c);
  d=b*c;
  if(c>a)
    printf("Out of stock\n");
  else
  {
    printf("The amount for %d pencil is %d",c,d);
    e=a-c;
    printf("Remaining number of %ss present in the stock: %d",s,e);
  }
    return 0;
}
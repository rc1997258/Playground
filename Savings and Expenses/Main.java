#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e;
  scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
  if(a>(b+c+d+e))
    printf("He can save the money");
  else if(a==(b+c+d+e))
    printf("He can manage the expenses");
  else
    printf("He has to work hard");
  return 0;
}
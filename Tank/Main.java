#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c,d,e;
  scanf("%f %f %f %f",&a,&b,&c,&d);
  e=3.14*a*a*b;
  if(e<(c*d))
    printf("The tank can be filled within %.1f hours",d);
  else
    printf("The tank cannot be filled within %.1f hours",d);
  return 0;
}
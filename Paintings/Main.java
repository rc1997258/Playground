#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e,f;
  scanf("%d %d %d %d %d %d",&a,&b,&c,&d,&e,&f);
  if((a*b)>=((c*d)+(e*f)))
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
  return 0;
}
#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c,d,e,f,g,h,i,a1,a2,a3,a4,a5;
  scanf("%f %f %f %f %f %f %f %f %f",&a,&b,&c,&d,&e,&f,&g,&h,&i);
  a1=(a*b*0.01)+c;
  a2=(d*e*0.01)+f;
  a3=i+g-(g*h*0.01);
  if(a1<a2)
    a4=a1;
  else
    a4=a2;
  if(a4<a3)
    a5=a4;
  else
    a5=a3;
  printf("In Flipkart: Rs.%d\n",(int)a1);
  printf("In Snapdeal: Rs.%d\n",(int)a2);
  printf("In Amazon: Rs.%d\n",(int)a3);
  printf("He will prefer Snapdeal");
  
}
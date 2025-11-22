#include<stdio.h>

int main ()
{

    char cValue = 'S';
    int iValue = 11;
    float fValue = 90.5f;
    double dValue = 90.56483;

    printf(" Size of character is : %lu\n ",sizeof(cValue));
    printf("Size of Integer is : %lu\n ",sizeof(iValue));
    printf("Size of Float is : %lu\n ",sizeof(fValue));
    printf("Size of Double is : %lu\n ",sizeof(dValue));

    printf("Address of cvalue is : %lu\n",&cValue);
    printf("Address of iValue is : %lu\n",&iValue);
    printf("Address of fValue is : %lu\n",&fValue);
    printf("Address of dValue is : %lu\n",&dValue);
    
    return 0;

}
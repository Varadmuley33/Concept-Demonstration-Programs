////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Datatype.c
//  Description :   Demonstrates basic C datatypes by declaring variables
//                  and displaying their values using formatted output.
//  Author :        Varad Nitin Muley
//  Date :          13/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

#include<stdio.h>

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main()
{
    char cValue = 'S';                 // Character variable
    int iValue = 11;                   // Integer variable
    float fValue = 90.78f;             // Float variable
    double dValue = 90.56483;          // Double variable

    printf("%c\n", cValue);            // Display character
    printf("%d\n", iValue);            // Display integer
    printf("%f\n", fValue);            // Display float
    printf("%lf\n", dValue);           // Display double

    return 0;
}   // End of main


/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : S 11 90.780000 90.564830
//
/////////////////////////////////////////////////////////////////

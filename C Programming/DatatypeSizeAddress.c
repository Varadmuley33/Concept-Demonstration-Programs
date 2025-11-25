////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DatatypeSizeAddress.c
//  Description :   Demonstrates the use of sizeof operator to display
//                  memory sizes and addresses of basic C datatypes.
//  Author :        Varad Muley
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
    float fValue = 90.5f;              // Float variable
    double dValue = 90.56483;          // Double variable

    printf("Size of character is : %lu\n", sizeof(cValue));
    printf("Size of Integer is   : %lu\n", sizeof(iValue));
    printf("Size of Float is     : %lu\n", sizeof(fValue));
    printf("Size of Double is    : %lu\n", sizeof(dValue));

    printf("Address of cValue is : %lu\n", &cValue);
    printf("Address of iValue is : %lu\n", &iValue);
    printf("Address of fValue is : %lu\n", &fValue);
    printf("Address of dValue is : %lu\n", &dValue);

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Size of character is : 1
//           Size of Integer is   : 4
//           Size of Float is     : 4
//           Size of Double is    : 8
//           Address values vary on each execution
//
/////////////////////////////////////////////////////////////////

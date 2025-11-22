////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DatatypeSize.c
//  Description :   Demonstrates the use of sizeof operator to display
//                  memory sizes (in bytes) of basic C datatypes.
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

    printf("Size of character is : %lu\n", sizeof(cValue));   // Display size of char
    printf("Size of Integer is   : %lu\n", sizeof(iValue));   // Display size of int
    printf("Size of Float is     : %lu\n", sizeof(fValue));   // Display size of float
    printf("Size of Double is    : %lu\n", sizeof(dValue));   // Display size of double

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Size of character is : 1
//           Size of Integer is   : 4
//           Size of Float is     : 4
//           Size of Double is    : 8
//
/////////////////////////////////////////////////////////////////

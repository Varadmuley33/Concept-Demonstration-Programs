////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     PointerDemo.c
//  Description :   Demonstrates that all pointers occupy the same
//                  memory size regardless of the data type they
//                  point to in C programming.
//  Author :        Varad Nitin Muley
//  Date :          15/10/2025
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
    int iValue = 11;                     // Integer variable
    char cValue = 'M';                   // Character variable

    int *iPtr = &iValue;                 // Pointer to integer
    char *cPtr = &cValue;                // Pointer to character

    printf("Size of iPtr : %lu \n", sizeof(iPtr));    // Size of integer pointer
    printf("Size of cPtr : %lu \n", sizeof(cPtr));    // Size of character pointer

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Size of iPtr : 8
//           Size of cPtr : 8
//
/////////////////////////////////////////////////////////////////

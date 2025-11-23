////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     QualifierConst.c
//  Description :   Demonstrates the behavior of the const qualifier
//                  in C and shows errors when attempting to modify
//                  a constant variable.
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
    int iNo1 = 10;                     // Normal integer variable
    const int iNo2 = 20;               // Constant integer variable

    iNo1++;                            // Valid operation

    // Below lines generate compilation errors
    iNo2++;                            // Attempt to modify const variable
    iNo2 = 30;                         // Reassignment not allowed

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Compilation error due to modification of const variable
//
/////////////////////////////////////////////////////////////////

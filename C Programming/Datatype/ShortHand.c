////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Shorthand.c
//  Description :   Demonstrates the working of pre-increment and
//                  post-increment operators in C programming.
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
    int i = 10;                         // Initial value for i
    int j = 10;                         // Initial value for j

    int iAns = 0;                       // Result of post-increment
    int jAns = 0;                       // Result of pre-increment

    iAns = i++;                         // Post-increment operation
    jAns = ++j;                         // Pre-increment operation

    printf("Value of i : %d\n", i);         // Displays updated i
    printf("Value of iAns : %d\n", iAns);   // Displays old value of i

    printf("Value of j : %d\n", j);         // Displays updated j
    printf("Value of jAns : %d\n", jAns);   // Displays new value of j

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Value of i : 11
//           Value of iAns : 10
//           Value of j : 11
//           Value of jAns : 11
//
/////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ArrayDemo2.c
//  Description :   Demonstrates accessing and assigning values to
//                  array elements using index positions in C.
//  Author :        Varad Nitin Muley
//  Date :          14/10/2025
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
    int Arr[4] = {10, 20, 30, 40};      // Pre-initialized array
    int Brr[3];                          // Uninitialized array

    Brr[2] = 30;                         // Assign value at index 2
    Brr[0] = 10;                         // Assign value at index 0
    Brr[1] = 20;                         // Assign value at index 1

    printf("%d\n", Arr[0]);
    printf("%d\n", Arr[1]);

    printf("%d\n", Brr[0]);
    printf("%d\n", Brr[1]);

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : 10
//           20
//           10
//           20
//
/////////////////////////////////////////////////////////////////

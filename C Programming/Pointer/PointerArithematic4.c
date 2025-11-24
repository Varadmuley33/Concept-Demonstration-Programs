////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     PointerDemo4.c
//  Description :   Demonstrates pointer subtraction which calculates
//                  the number of elements between two pointers
//                  pointing within the same array.
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
    int Arr[] = {11, 21, 51, 101, 111};     // Integer array

    int *p = NULL;                           // Pointer variable
    int *q = NULL;                           // Pointer variable

    p = &(Arr[1]);                           // Pointing to second element
    q = &(Arr[4]);                           // Pointing to fifth element

    printf("Result of subtraction is %ld\n", q - p);   // Pointer difference

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Result of subtraction is 3
//
/////////////////////////////////////////////////////////////////

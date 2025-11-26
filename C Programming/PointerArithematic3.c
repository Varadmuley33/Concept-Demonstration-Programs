////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     PointerDemo3.c
//  Description :   Demonstrates pointer arithmetic by adding an
//                  integer value to a pointer to access different
//                  positions within an array.
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

    // p + q;                                // Not allowed in C (pointer + pointer)

    p = p + 3;                               // Move pointer ahead by 3 positions

    printf("Data fetched by p is : %d\n", *p);

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Data fetched by p is : 111
//
/////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     PointerDemo1.c
//  Description :   Demonstrates how pointers can access specific
//                  elements of an array by storing their addresses
//                  and retrieving the corresponding data.
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

    printf("Data fetched by p is : %d\n", *p);
    printf("Data fetched by q is : %d\n", *q);

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Data fetched by p is : 21
//           Data fetched by q is : 111
//
/////////////////////////////////////////////////////////////////

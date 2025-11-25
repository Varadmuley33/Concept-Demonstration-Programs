////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ArrayDemo4.c
//  Description :   Demonstrates pointer arithmetic differences between
//                  array name and address of array using sizeof and
//                  address manipulation in C.
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
    int Arr[5] = {10, 20, 30, 40, 50};     // Integer array

    printf("Size of Arr : %lu\n", sizeof(Arr));     // Total size of array

    printf("Arr : %lu\n", Arr);                       // Base address
    printf("&Arr : %lu\n", &Arr);                     // Address of whole array

    printf("Arr + 1 : %lu\n", Arr + 1);               // Next element address
    printf("(&Arr) + 1 : %lu\n", (&Arr) + 1);         // Next array block address

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Size of Arr : 20
//           Base address displayed
//           Arr + 1 increases by 4 bytes
//           (&Arr) + 1 increases by 20 bytes
//
/////////////////////////////////////////////////////////////////

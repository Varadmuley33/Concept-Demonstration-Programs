////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     arraydemo1.c
//  Description :   Demonstrates different ways of array initialization
//                  and displays their total memory sizes using sizeof.
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
    int Arr[4] = {10, 20, 30, 40};          // Fully initialized array
    int Brr[]  = {10, 20, 30, 40, 50};      // Auto-sized array
    int Crr[6] = {10, 20, 30};              // Partially initialized array

    printf("Size of Arr is %lu\n", sizeof(Arr));
    printf("Size of Brr is %lu\n", sizeof(Brr));
    printf("Size of Crr is %lu\n", sizeof(Crr));

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Size of Arr is 16
//           Size of Brr is 20
//           Size of Crr is 24
//
/////////////////////////////////////////////////////////////////

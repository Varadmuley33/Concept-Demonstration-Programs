////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     MultiLevelPointerDemo.c
//  Description :   Demonstrates multiple levels of pointers and how
//                  indirect access retrieves the same value through
//                  different pointer levels in C programming.
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
    int no = 11;                         // Integer variable

    int *p = &no;                        // Pointer to integer
    int **q = &p;                        // Pointer to pointer
    int ***a = &q;                       // Three level pointer
    int ****b = &a;                      // Four level pointer
    int *****c = &b;                     // Five level pointer

    printf("%d \n", no);                // Direct access
    printf("%d \n", *p);                // Single dereference
    printf("%d \n", **q);               // Double dereference
    printf("%d \n", ***a);              // Triple dereference
    printf("%d \n", ****b);             // Four level dereference
    printf("%d \n", *****c);            // Five level dereference

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : 11
//           11
//           11
//           11
//           11
//           11
//
/////////////////////////////////////////////////////////////////

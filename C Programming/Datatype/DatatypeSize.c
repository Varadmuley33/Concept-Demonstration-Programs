///////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Ganesh.c
//  Description :   This program demonstrates the use of sizeof operator to display 
//                  memory sizes (in bytes) of basic data types: char, int, float, and double.
//  Author :        Varad Muley
//  Date :          13/10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int main ()
{

    char cValue = 'S';
    int iValue = 11;
    float fValue = 90.5f;
    double dValue = 90.56483;

    printf(" Size of character is : %lu\n ",sizeof(cValue));
    printf("Size of Integer is : %lu\n ",sizeof(iValue));
    printf("Size of Float is : %lu\n ",sizeof(fValue));
    printf("Size of Double is : %lu\n ",sizeof(dValue));
    
    return 0;

}
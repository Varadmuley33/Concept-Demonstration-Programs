////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     FunctionUserDefinedIO.c
//  Description :   Demonstrates user-defined function in C which accepts
//                  two integers from user and returns their addition.
//  Author :        Varad Nitin Muley
//  Date :          17/10/2025
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
//  Function Name : Addition
//  Description :   Returns addition of two integers
//  Input :         Integer, Integer
//  Output :        Integer
//
/////////////////////////////////////////////////////////////////

int Addition(int iNo1, int iNo2)
{
    int iSum = 0;                      

    iSum = iNo1 + iNo2;                // Addition logic

    return iSum;                       
}

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0, iValue2 = 0;      // Variables to accept input
    int iAns = 0;

    printf("Enter first number : \n");
    scanf("%d",&iValue1);

    printf("Enter second number : \n");
    scanf("%d",&iValue2);

    iAns = Addition(iValue1, iValue2); // Function call

    printf("Addition is : %d\n", iAns);  // Display result

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10   20
//  Output : Addition is : 30
//
//  Input : -5   15
//  Output : Addition is : 10
//
//  Input : 0   0
//  Output : Addition is : 0
//
/////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DataType.cpp
//  Description :   Demonstrates basic C++ data types by declaring
//                  variables and displaying their values.
//  Author :        Varad Nitin Muley
//  Date :          14/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main()
{
    char cValue = 'A';                  // Character variable
    int iValue = 10;                    // Integer variable
    float fValue = 25.50f;              // Float variable
    double dValue = 123.456;            // Double variable
    bool bValue = true;                 // Boolean variable

    cout << "Character : " << cValue << endl;
    cout << "Integer   : " << iValue << endl;
    cout << "Float     : " << fValue << endl;
    cout << "Double    : " << dValue << endl;
    cout << "Boolean   : " << bValue << endl;

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Character : A
//           Integer   : 10
//           Float     : 25.5
//           Double    : 123.456
//           Boolean   : 1
//
/////////////////////////////////////////////////////////////////

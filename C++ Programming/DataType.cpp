////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DataType.cpp
//  Description :   Demonstrates different data types in C++ and their usage.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025
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
    int iValue = 10;            // Integer data type
    float fValue = 20.5f;       // Float data type
    double dValue = 99.99;      // Double data type
    char cValue = 'A';          // Character data type
    bool bValue = true;         // Boolean data type

    cout << "Integer value : " << iValue << endl;
    cout << "Float value : " << fValue << endl;
    cout << "Double value : " << dValue << endl;
    cout << "Character value : " << cValue << endl;
    cout << "Boolean value : " << bValue << endl;

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase:
//
//  Output :
//  Integer value : 10
//  Float value : 20.5
//  Double value : 99.99
//  Character value : A
//  Boolean value : 1
//
/////////////////////////////////////////////////////////////////

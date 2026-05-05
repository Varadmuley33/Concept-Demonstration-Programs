////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DataTypeAdvanceDemo.cpp
//  Description :   Demonstrates slightly advanced data types in C++
//                  like long, short, unsigned and type casting.
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
    short sValue = 10;            // Short data type
    long lValue = 100000;         // Long data type
    unsigned int uValue = 50;     // Unsigned integer
    float fValue = 25.75f;        // Float data type
    int iValue = (int)fValue;     // Type casting (float to int)

    cout << "Short value : " << sValue << endl;
    cout << "Long value : " << lValue << endl;
    cout << "Unsigned value : " << uValue << endl;
    cout << "Float value : " << fValue << endl;
    cout << "Typecasted int value : " << iValue << endl;

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase:
//
//  Output :
//  Short value : 10
//  Long value : 100000
//  Unsigned value : 50
//  Float value : 25.75
//  Typecasted int value : 25
//
/////////////////////////////////////////////////////////////////

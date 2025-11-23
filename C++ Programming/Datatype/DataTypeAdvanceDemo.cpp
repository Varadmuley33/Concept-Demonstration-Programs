////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     DataTypeAdvancedDemo.cpp
//  Description :   Demonstrates various C++ data types along with
//                  their memory sizes using sizeof operator.
//  Author :        Varad Nitin Muley
//  Date :          13/10/2025
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
    char cValue = 'A';                      // Character
    int iValue = 10;                        // Integer
    float fValue = 25.50f;                  // Float
    double dValue = 123.456;                // Double
    bool bValue = true;                     // Boolean
    short int sValue = 5;                   // Short integer
    long lValue = 100000;                   // Long integer
    unsigned int uValue = 50;               // Unsigned integer

    cout << "Character Value : " << cValue << endl;
    cout << "Integer Value   : " << iValue << endl;
    cout << "Float Value     : " << fValue << endl;
    cout << "Double Value    : " << dValue << endl;
    cout << "Boolean Value   : " << bValue << endl;
    cout << "Short Value     : " << sValue << endl;
    cout << "Long Value      : " << lValue << endl;
    cout << "Unsigned Value  : " << uValue << endl;

    cout << endl;

    cout << "Size of Character : " << sizeof(cValue) << " bytes" << endl;
    cout << "Size of Integer   : " << sizeof(iValue) << " bytes" << endl;
    cout << "Size of Float     : " << sizeof(fValue) << " bytes" << endl;
    cout << "Size of Double    : " << sizeof(dValue) << " bytes" << endl;
    cout << "Size of Boolean   : " << sizeof(bValue) << " bytes" << endl;
    cout << "Size of Short     : " << sizeof(sValue) << " bytes" << endl;
    cout << "Size of Long      : " << sizeof(lValue) << " bytes" << endl;
    cout << "Size of Unsigned  : " << sizeof(uValue) << " bytes" << endl;

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input : None (Predefined values)
//  Output : Displays values and respective memory sizes of all
//           demonstrated C++ data types.
//
/////////////////////////////////////////////////////////////////

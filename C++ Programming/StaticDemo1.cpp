////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     StaticDemo1.cpp
//  Description :   Demonstrates use of static data member and static member function
//                  in a C++ class.
//  Author :        Varad Nitin Muley
//  Date :          18/11/2025     
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

#include <iostream>
using namespace std;

/////////////////////////////////////////////////////////////////
//
//  Class Name : Demo
//  Description : Contains instance variables, static variable and
//                static member function.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public:
        int i;
        int j;
        static int x;

        Demo()
        {
            this->i = 0;
            this->j = 0;
        }

        Demo(int a , int b)
        {
            this->i = a ;
            this->j = b;
        }

        void Fun()   // void Fun (Demo * const this)
        {
            cout<<"Inside Fun\n";
        }

        static void Gun()
        {
            cout<<"Inside Gun\n";
        }

};

int Demo :: x = 11;

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main ()
{
    Demo :: Gun();
    cout<<"Value of X is :"<<Demo::x<<"\n";

    return 0;

}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase:
//
//  Output :
//  Inside Gun
//  Value of X is :11
//
/////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name      : AccessSpecifier.cpp
//  Description    : Demonstrates the behavior of public, private, and
//                   protected access specifiers in base and derived classes.
//  Author         : Varad Nitin Muley
//  Date           : 17/10/2025
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
//  Class Name : Base
//  Description : Demonstrates access control using different
//                access specifiers within a class.
//
/////////////////////////////////////////////////////////////////

class Base
{
    public:
        int i;

    private:
        int j;

    protected:
        int k;

    public:
        Base()
        {
            i = 10;
            j = 20;
            k = 30;
        }

        void fun()
        {
            cout << i << "\n";
            cout << j << "\n";
            cout << k << "\n";
        }
};

/////////////////////////////////////////////////////////////////
//
//  Class Name : Derived
//  Description : Demonstrates inheritance and accessibility
//                of base class members.
//
/////////////////////////////////////////////////////////////////

class Derived : public Base
{
    public:
        int x;

        void Display()
        {
            cout << i << "\n";
            // cout << j << "\n";    // Not allowed (private)
            cout << k << "\n";
        }
};

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main()
{
    Base bobj;
    Derived dobj;

    cout << bobj.i << "\n";
    // cout << bobj.j << "\n";      // Not allowed
    // cout << bobj.k << "\n";      // Not allowed

    cout << dobj.i << "\n";
    // cout << dobj.j << "\n";      // Not allowed
    // cout << dobj.k << "\n";      // Not allowed

    dobj.fun();
    dobj.Display();

    return 0;
}

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Output : Displays accessibility of base and derived class members
//           based on access specifiers.
//
/////////////////////////////////////////////////////////////////

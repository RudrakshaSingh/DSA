#include<iostream>
#include <string>
#include <limits>
using namespace std;

int main(){
    string s;
    cout << "enter: " << endl;
    cin>>s;
    cout<<s<<endl;// it will not give full sentance just first word

     // Clear the input buffer
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    // for full line use getline
    string fullLine;
    cout << "enter :" << endl;
    getline(cin,fullLine);
    cout << fullLine << endl;

    return 0;
}
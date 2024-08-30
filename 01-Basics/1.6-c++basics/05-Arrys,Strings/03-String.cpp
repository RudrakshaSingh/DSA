#include<bits/stdc++.h>
using namespace std;

int main(){
    string s="hyih";
    cout << s[3] << endl;
    cout << s.size() << endl;
    cout << s.length() << endl;

    s[3]='3';//cannot use double quote
    cout << s << endl;
    return 0;
}
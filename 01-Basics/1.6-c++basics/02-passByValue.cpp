#include<bits/stdc++.h>
using namespace std;

void printing(string name){
    name[3]='@';
    cout << name << endl;
}

int main(){
    string name="rudy";
    printing(name);
    cout << name << endl;
    return 0;
}

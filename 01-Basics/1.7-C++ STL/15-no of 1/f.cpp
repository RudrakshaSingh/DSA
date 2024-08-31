#include<bits/stdc++.h>
using namespace std;

//builtin_popcoun => for iint
//builtin_popcounll => for long long int

int main(){
    int n = 7;
    int cnt = __builtin_popcountll(n);//(0000....111=> total 32 bits)
    //no of 1 is 3 

    // Output the number of 1 bits
    cout << "Number of 1 bits in " << n << " is " << cnt << endl;
    return 0;
}
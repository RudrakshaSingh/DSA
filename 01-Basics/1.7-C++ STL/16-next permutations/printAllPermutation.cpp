//permutation of 132
// 123
// 132
// 213
// 231
// 312
// 321

#include<bits/stdc++.h>
using namespace std;

int main(){
    string s="132";
    sort(s.begin(),s.end());
    do
    {
        cout << s << endl;
    } while (next_permutation(s.begin(),s.end()));
    

    return 0;
}
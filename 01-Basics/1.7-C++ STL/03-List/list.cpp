#include<bits/stdc++.h>
using namespace std;

int main(){
    list<int> ls;

    ls.push_back(2);//{2}
    ls.emplace_back(4);//{2,4}

    ls.push_front(5);//{5,2,4}
    ls.emplace_front(3);//{3,5,2,4}

    cout << "List contents: ";
    for (const auto& elem : ls) {
        cout << elem << " ";
    }
    cout << endl;
    return 0;
}
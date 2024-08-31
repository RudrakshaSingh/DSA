// multiset-> sorted but not unique can have duplicate

#include <bits/stdc++.h>
using namespace std;

int main()
{
    // Everything is same as set
    // can stores duplicate elements also

    multiset<int> ms;

    ms.insert(1); // {1}
    ms.insert(1); // {1, 1}
    ms.insert(1); // {1, 1, 1}

    ms.erase(1); // all 1's erased

    int cnt = ms.count(1); // no of 1's

    ms.insert(1); // {1}
    ms.insert(1); // {1, 1}
    ms.insert(1); // {1, 1, 1}

    // only a single one erased
    ms.erase(ms.find(1)); // it is giving adress therefore erases only one 1
    
    auto it1 = ms.find(1);
    auto it2 = next(it1, 2); // Points to the third occurrence of 1
    ms.erase(it1, it2); // Erase two elements starting from the iterator it1

    // rest all function same as set

    return 0;
}
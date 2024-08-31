#include <bits/stdc++.h>
using namespace std;

void print(string a, vector<int> v)
{
    cout << "Vector  " << a << " contents: ";
    for (size_t i = 0; i < v.size(); ++i)
    {
        std::cout << v[i] << " ";
    }
    cout << std::endl;
}

int main()
{
    //------------------- 1 -----------------------------//
    // declaration
    vector<int> v; // creates empty container []

    v.push_back(1); //[1]

    // empace is faster than pushback
    v.emplace_back(2); // similar to pushbac, it dynamically increses the size and pushes it back

    print("v", v);
    //--------------------- 2 ---------------------------//

    vector<pair<int, int>> v2;

    v2.push_back({1, 2});

    v2.emplace_back(1, 2); // automatically assumes it as pair

    std::cout << "Vector v2 contents: ";
    for (size_t i = 0; i < v2.size(); ++i)
    {
        std::cout << v2[i].first << " " << v2[i].second << ", " << " ";
    }
    std::cout << std::endl;
    //--------------------- 3,4,5 ---------------------------//

    vector<int> v3(5, 100); //{100,100,100,100,100}//can still increse its size
    print("v3", v3);

    vector<int> v4(5); //{0,0,0,0,0}
    print("v4", v4);

    vector<int> v5(5, 20);
    print("v5", v5);

    //--------------------- v6 ---------------------------//

    // copying vector v1 to vectorv6
    vector<int> v6(v3);
    print("v6", v6);

    
    return 0;
}
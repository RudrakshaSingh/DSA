#include <iostream>
#include <algorithm>  // For std::next_permutation
using namespace std;

int main() {
    string s = "123";
    
    // Generate the first permutation
    bool first = true;
    do {
        if (!first) {
            cout << s << endl;
        }
        first = false;
    } while (next_permutation(s.begin(), s.end()));

    return 0;
}

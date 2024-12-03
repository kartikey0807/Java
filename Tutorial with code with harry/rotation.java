public class rotation {
    
}
#include <iostream>
#include <vector>

using namespace std;

vector<int> leftRotate(const vector<int>& arr, int d) {
    int n = arr.size();
    vector<int> rotatedArr(n);

    // Calculate the index from where rotation starts
    int rotationIndex = d % n;

    // Copy elements after rotation index
    for (int i = 0; i < n - rotationIndex; ++i) {
        rotatedArr[i] = arr[i + rotationIndex];
    }

    // Copy elements before rotation index
    for (int i = 0; i < rotationIndex; ++i) {
        rotatedArr[n - rotationIndex + i] = arr[i];
    }

    return rotatedArr;
}

int main() {
    // Example usage
    vector<int> arr = {1, 2, 3, 4, 5};
    int d = 2; // Number of left rotations

    vector<int> rotatedArr = leftRotate(arr, d);

    cout << "Array after " << d << " left rotations: ";
    for (int num : rotatedArr) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
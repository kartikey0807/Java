#include <iostream>

using namespace std;

void leftRotate(int arr[], int d, int n)
{
    for (int i = 0; i < d; i++)
    {
        int temp = arr[0];
        for (int j = 0; j < n - 1; j++)
        {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = temp;
    }
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int n = sizeof(arr) / sizeof(arr[0]);
    int d = 2;

    leftRotate(arr, d, n);
    
    cout << "rotated array: ";
    for (int i = 0; i < n; i++)
    {
        cout  << arr[i] << " ";
    }

    return 0;
}
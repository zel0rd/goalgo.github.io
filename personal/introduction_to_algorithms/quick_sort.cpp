#include "algos.hpp"

int swap(int &a, int &b)
{
  int temp = a;
  a = b;
  b = temp;
}

int partition(int arr[], int p, int r)
{
  int x = arr[r];
  int i = p - 1;

  for (int j = p; j < r; j++)
  {
    if (arr[j] <= x)
    {
      i++;
      swap(arr[i], arr[j]);
    }
  }

  swap(arr[i + 1], arr[r]);

  return i + 1;
}

void quicksort(int arr[], int p, int r)
{
  if (p >= r)
    return;
  int q = partition(arr, p, r);
  quicksort(arr, p, q - 1);
  quicksort(arr, q + 1, r);
}

void quicksort(int arr[], int size)
{
  quicksort(arr, 0, size - 1);
}
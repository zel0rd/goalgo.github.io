#define CATCH_CONFIG_MAIN
#define UNIT_TEST

#include <iostream>
using namespace std;

#include "catch.hpp"

#include "../introduction_to_algorithms/algos.hpp"

void print(char *prefix, int arr[], int size)
{
  cout << prefix << " ";
  for (int i = 0; i < size; i++)
  {
    if (i != size - 1)
    {
      cout << arr[i] << ", ";
    }
    else
    {
      cout << arr[i] << endl;
    }
  }
}

TEST_CASE("Merge sort", "[merge_sort]")
{
  int arr[6] = {3, 4, 2, 1, 5, 1};

  merge_sort(arr, 6);

  print("merge sort result", arr, 6);

  REQUIRE(arr[0] == 1);
  REQUIRE(arr[1] == 1);
  REQUIRE(arr[2] == 2);
  REQUIRE(arr[3] == 3);
  REQUIRE(arr[4] == 4);
  REQUIRE(arr[5] == 5);
}

TEST_CASE("Heap sort", "[heap_sort]")
{
  int arr[6] = {3, 4, 2, 1, 5, 1};

  heap_sort(arr, 6);

  print("heap sort result", arr, 6);

  REQUIRE(arr[0] == 1);
  REQUIRE(arr[1] == 1);
  REQUIRE(arr[2] == 2);
  REQUIRE(arr[3] == 3);
  REQUIRE(arr[4] == 4);
  REQUIRE(arr[5] == 5);
}

TEST_CASE("Quick sort", "[quick_sort]")
{
  int arr[6] = {3, 4, 2, 1, 5, 1};

  quicksort(arr, 6);

  print("quick sort result", arr, 6);

  REQUIRE(arr[0] == 1);
  REQUIRE(arr[1] == 1);
  REQUIRE(arr[2] == 2);
  REQUIRE(arr[3] == 3);
  REQUIRE(arr[4] == 4);
  REQUIRE(arr[5] == 5);
}
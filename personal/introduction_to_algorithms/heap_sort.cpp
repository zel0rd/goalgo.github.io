#include "algos.hpp"

void init_heap(Heap &heap, int size)
{
  heap.size = 0;
  heap.data = new int[size + 1];
}

void clear_heap(Heap &heap)
{
  delete[] heap.data;
}

void put_heap_item(Heap &heap, int item)
{
  heap.size++;
  heap.data[heap.size] = item;
  int i;
  for (i = heap.size; i > 1; i /= 2)
  {
    if (heap.data[i] > heap.data[i / 2])
    {
      heap.data[i] = heap.data[i / 2];
    }
    else
    {
      break;
    }
  }
  heap.data[i] = item;
  int root = heap.data[1];
}

void build_max_heap(Heap &heap, int arr[], int size)
{
  for (int i = 0; i < size; i++)
  {
    put_heap_item(heap, arr[i]);
  }
}

void heap_sort(int arr[], int size)
{
  Heap heap;
  init_heap(heap, size);
  build_max_heap(heap, arr, size);

  for (int i = size; i > 0; i--)
  {
    arr[size - i] = heap.data[i];
    heap.size--;
  }

  clear_heap(heap);
}

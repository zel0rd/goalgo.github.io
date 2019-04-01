void merge(int arr[], int l, int m, int h);
void merge_sort(int arr[], int l, int h);
void merge_sort(int arr[], int size);

typedef struct _heap
{
  int size;
  int *data;
} Heap;

void init_heap(Heap &heap, int size);
void clear_heap(Heap &heap);
void put_heap_item(Heap &heap, int item);
void build_max_heap(Heap &heap, int arr[], int size);
void heap_sort(int arr[], int size);

int partition(int arr[], int p, int r);
void quicksort(int arr[], int p, int r);
void quicksort(int arr[], int size);
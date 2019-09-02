column, row = input().split()
row = int(row)
column = int(column)

for i in range(0, row):
    for i in range(0, column):
        print("*", end="")
    print()

data = [
    [3, 5, 2, 4, 1],    #15, 5
    [4, 5, 1],          #10, 3
    [4, 4, 1, 5, 4],    #18, 5
    [4, 5],             #9, 2
]
 
result = {}
 
for index, lis in enumerate(data):
    list_sum = sum(lis)
    list_len = len(lis)
 
    result[index] = (list_sum, list_len)
 
print(result)


"""
0   [3,5,2,4,1] 15  5   (15, 5)
1   [4,5,1]     10  3   (10, 3)
2   [4,4,1,5,4] 18  5   (18, 5)
3   [4,5]       9   2   (9, 2)

"""
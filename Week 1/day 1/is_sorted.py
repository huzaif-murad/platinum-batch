my_list=[23,34,45,12,56,67]

is_sorted=True

for i in range(1,len(my_list)):
    if(not my_list[i]>=my_list[i-1]):
        is_sorted=False
        break

if(is_sorted):
    print("Sorted.")
else:
    print("Not sorted.")
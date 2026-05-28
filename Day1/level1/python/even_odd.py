


def even_odd(array):

    even=[]
    odd=[]
    big_array=[]
    for number in array:
        if number % 2==0:
            even.append(number)
        elif number % 2==1:
            odd.append(number)

    big_array.append(odd)
    big_array.append(even)

    return big_array





        

### Question 1
Given an array of numbers, find the index of the smallest array element (the pivot), for which the sums of
all elements to the left and to the right are equal. The array may not be reordered.

**Example**

arr=[1,2,3,4,6]

- the sum of the first three elements, 1+2+3=6. The value of the last element is 6.
- Using zero based indexing, arr[3]=4 is the pivot between the two subarrays.
- The index of the pivot is 3.

**Function Description**

Complete the function balancedSum in the editor below.

balancedSum has the following parameter(s):
    
    int arr[n]: an array of integers

Returns:

    int: an integer representing the index of the pivot

**Constraints**
- 3 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ arr[i] ≤ 2 × 10<sup>4</sup>, where 0 ≤ i < n 
- It is guaranteed that a solution always exists.

### Question 2
Given a barcode, query the API at https://jsonmock.hackerrank.com/api/inventory?barcode=barcode and
return the item's discounted price.

The response is a JSON object with 5 fields. The essential field is data:
- data: Either an empty array or an array with a single object that contains the item's record.
- In the data array, the item has the following schema:
  - barcode - the barcode for the product (String)
  - price - the gross selling price (Number)
  - discount: the discount percent to apply (Number).
  - Some fields that are not of interest.

page, per_page, total, total_pages, etc. are not required for this task.

If the barcode is found, the data array contains exactly 1 element. If not, it is empty and the function should
return '-1'.

An example of the product record from https://jsonmock.hackerrank.com/api/inventory?
barcode=74001755 is:

```json
{
  "barcode": "74001755",
  "item": "Ball Gown",
  "category": "Full Body Outfits",
  "price": 785,
  "discount": 7,
  "available": 1
}
```

Use the "discount" and the "price" properties to calculate the discounted price rounded to the nearest
integer.

    discountedPrice = price - ((discount / 100) * price)

**Function Description**

Complete the getDiscountedPrice function in the editor.

getDiscountedPrice has the following parameters:
    
    string barcode: the item to query

**Returns**

    int: the discounted price rounded to the nearest integer or -1

**Constraints**
- There will be either 1 or 0 records in data.
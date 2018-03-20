package com.cleancode;

import com.cleancode.test.EmptyArrayException;

public class BinarySearch {

	public static Object search(int[] collection, int searchedElement) throws EmptyArrayException {
		if(collection.length==0){
			throw new EmptyArrayException("Invalid Input!!Array is Empty");
		}
		return binarySearch(collection,0,collection.length-1,searchedElement);
	}
	public static int binarySearch(int arr[], int startIndex, int endIndex, int searchedElement)
    {
		if (endIndex>=startIndex)
        {
            int mid = startIndex + (endIndex - startIndex)/2;
            if (arr[mid] == searchedElement)
               return mid;
            if (arr[mid] > searchedElement)
               return binarySearch(arr, startIndex, mid-1, searchedElement);
            return binarySearch(arr, mid+1, endIndex, searchedElement);
        }
        else{
        	return -1;
        }

}
}

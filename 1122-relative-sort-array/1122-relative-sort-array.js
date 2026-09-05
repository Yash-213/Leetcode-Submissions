/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    let n = arr1.length;
    const arr = new Array(n);
    let idx = 0;
    arr1.sort((a, b) => a - b);
    for (let i = 0; i < arr2.length; i++) 
        for (let j = 0; j < n; j++) 
            if (arr1[j] === arr2[i]) {
                arr[idx++] = arr1[j];
                arr1[j] = -1;
            }
            
    for (let i = 0; i < n; i++) 
        if (arr1[i] !== -1) arr[idx++] = arr1[i];

    return arr;
};
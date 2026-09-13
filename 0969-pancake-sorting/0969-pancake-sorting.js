var pancakeSort = function(arr) {
    const list = new Array();
    for (let i = arr.length; i > 1; i--) {
        let max = 0;
        for (let j = 1; j < i; j++) {
            if (arr[j] > arr[max]) max = j;
        }
        if (max === i - 1) continue;

        if (max != 0) {
            flip(arr, max + 1);
            list.push(max + 1);
        }
        flip(arr, i);
        list.push(i);
    }
    return list;
};

var flip = function(arr, k) {
    let l = 0, r = k - 1;
    while (l < r) {
        let temp = arr[l];
        arr[l++] = arr[r];
        arr[r--] = temp;
    }
}
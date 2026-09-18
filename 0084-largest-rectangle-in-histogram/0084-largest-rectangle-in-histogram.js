var largestRectangleArea = function (heights) {
    const arr = [0, ...heights, 0];
    const sk = [];
    let max = 0;

    for (let i = 0; i < arr.length; i++) {
        while (sk.length && arr[sk[sk.length - 1]] > arr[i]) {
            const h = arr[sk.pop()];
            const w = i - sk[sk.length - 1] - 1;

            max = Math.max(max, h * w);
        }
        sk.push(i);
    }
    return max;
};
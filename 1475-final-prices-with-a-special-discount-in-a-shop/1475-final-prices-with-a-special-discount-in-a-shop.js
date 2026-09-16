var finalPrices = function (prices) {
    const n = prices.length;
    const arr = new Array(n);
    for (let i = 0; i < n - 1; i++) {
        arr[i] = prices[i];
        for (let j = i + 1; j < n; j++) {
            if (prices[j] <= prices[i]) {
                arr[i] = prices[i] - prices[j];
                break;
            }
        }
    }
    arr[n - 1] = prices[n - 1];
    return arr;
};
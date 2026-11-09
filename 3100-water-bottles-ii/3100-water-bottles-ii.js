/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var maxBottlesDrunk = function (numBottles, numExchange) {
    let ans = 0;
    let exchange = 0;
    while (numBottles > 0) {
        ans += numBottles;
        exchange += numBottles;
        numBottles = 0;
        if (exchange < numExchange) break;
        exchange -= numExchange;
        numBottles++;
        numExchange++;
    }
    return ans;
};
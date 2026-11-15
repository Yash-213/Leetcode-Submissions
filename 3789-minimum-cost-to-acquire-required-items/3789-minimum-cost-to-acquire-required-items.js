/**
 * @param {number} cost1
 * @param {number} cost2
 * @param {number} costBoth
 * @param {number} need1
 * @param {number} need2
 * @return {number}
 */
var minimumCost = function(cost1, cost2, costBoth, need1, need2) {
    if (need1 > need2) 
            return minimumCost(cost2, cost1, costBoth, need2, need1);

        let minCost1 = need1 * Math.min(costBoth, cost1 + cost2);
        let minCost2 = (need2 - need1) * Math.min(cost2, costBoth);

        return minCost1 + minCost2;
};
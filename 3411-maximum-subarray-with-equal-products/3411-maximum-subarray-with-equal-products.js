/**
 * @param {number[]} nums
 * @return {number}
 */
var maxLength = function (nums) {
    const getGcd = (a, b) => {
        return b === 0 ? a : getGcd(b, a % b);
    }
    const n = nums.length;
    let len = 0;

    for (let l = 0; l < n; l++) {
        let prod = 1;
        let gcd = 0;
        let lcm = 1;

        for (let r = l; r < n; r++) {
            const x = nums[r];

            prod *= x;
            gcd = getGcd(gcd, x);
            lcm = (lcm / getGcd(lcm, x)) * x;

            if (prod == lcm * gcd)
                len = Math.max(len, r - l + 1);
        }
    }
    return len;
};

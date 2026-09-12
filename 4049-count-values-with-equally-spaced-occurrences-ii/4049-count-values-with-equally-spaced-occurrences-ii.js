var countSpecialIntegers = function(nums) {
    const n = nums.length;
    const map = new Map();
    for (let i = 0; i < n; i++) {
        if (!map.has(nums[i])) 
            map.set(nums[i], []);
        
        map.get(nums[i]).push(i);
    }
    let count = 0;

    for (const list of map.values()) {
        if (list.length < 3) continue;

        const diff = list[1] - list[0];
        let flag = true;

        for (let i = 2; i < list.length; i++) {
            const curr = list[i] - list[i - 1];
            if (curr !== diff) {
                flag = false;
                break;
            }
        }
        if (flag) count++;
    }
    return count;
};
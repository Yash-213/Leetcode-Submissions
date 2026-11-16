/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var digitSum = function (s, k) {
        // Repeat the process until the string length becomes <= k
    while (s.length > k) {
        // add sum in string by using sliding window
        let result = "";
        // Divide the string into groups of size k
        for (let i = 0; i < s.length; i += k) {
            let sum = 0;
            // Calculate the sum of digits in the current group
            for (let j = i; j < i + k && j < s.length; j++) 
                // Convert the character into its numeric value
                sum += s.charCodeAt(j) - 48;

            // Append the group's digit sum to the result
            result += sum;
        }
        // Use the newly generated string for the next iteration
        s = result; 
    }
    // Return the final string when its length is <= k
    return s;
};
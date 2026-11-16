
/**
 * @param {number[]} queries
 * @param {number} m
 * @return {number[]}
 */
var processQueries = function (queries, m) {
    let n = queries.length;
    let answer = new Array(n);

    // Add elements from 1 to m in the initial permutation
    let listP = Array.from({ length: m }, (_, i) => i + 1);

    for (let i = 0; i < n; i++) {
        // Search position of the queried element in listP
        let position = searchPosition(listP, queries[i]);

        answer[i] = position; // Add position to answer array

        // Remove the element and move it to the first position
        let removedElement = listP.splice(position, 1)[0];
        listP.unshift(removedElement);
    }

    return answer;
};

// Linear Search to find the position of an element in listP
function searchPosition(listP, element) {
    for (let i = 0; i < listP.length; i++) {
        if (listP[i] === element)
            return i;
    }

    return -1; // Element not found
}

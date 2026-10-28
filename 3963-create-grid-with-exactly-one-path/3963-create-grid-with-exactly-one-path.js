/**
 * @param {number} m
 * @param {number} n
 * @return {string[]}
 */
var createGrid = function(m, n) {
    let grid = [];

    grid.push('.'.repeat(n));

    for (let i = 1; i < m; i++) 
        grid.push('#'.repeat(n - 1) + '.');

    return grid;
};
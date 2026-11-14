/**
 * @param {number[][]} grid
 * @return {number[][]}
 */

var sortMatrix = function (grid) {
    const n = grid.length;
    const m = grid[0].length;

    for (let i = 0; i < n; i++)
        sort(grid, i, 0, true);

    for (let i = 1; i < m; i++)
        sort(grid, 0, i, false);

    return grid;
};

function sort(grid, i, j, flag) {
    const n = grid.length;
    const m = grid[0].length;

    let r = i;
    let c = j;

    const list = [];

    while (r < n && c < m) 
        list.push(grid[r++][c++]);

    if (flag)
        list.sort((a, b) => b - a);
    else
        list.sort((a, b) => a - b);

    r = i;
    c = j;

    let idx = 0;

    while (idx < list.length) 
        grid[r++][c++] = list[idx++];
};

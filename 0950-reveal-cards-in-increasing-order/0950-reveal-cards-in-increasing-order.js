var deckRevealedIncreasing = function (deck) {
    const n = deck.length;
    deck.sort((a, b) => a - b);

    const dqe = [];

    for (let i = n - 1; i > -1; i--) {
        if (dqe.length > 0)
            dqe.unshift(dqe.pop());

        dqe.unshift(deck[i]);
    }

    const arr = new Array(n);
    for (let i = 0; i < n; i++)
    arr[i] = dqe.shift();

    return arr;
};
function doesAliceWin(s: string): boolean {
    for (const ch of s)
        if ("aeiou".indexOf(ch) != -1) return true;

    return false;
};
var sortSentence = function(s) {
    const str = s.split(" ");
    const arr = new Array(str.length);

    for (let i = 0; i < str.length; i++) {
        arr[str[i].charAt(str[i].length - 1) - '1'] = str[i];
    }
    let sb = "";
    for (let i = 0; i < arr.length; i++) {
        sb += arr[i].substring(0, arr[i].length - 1)
        if (i < arr.length - 1) sb += " ";
    }
    return sb;
};
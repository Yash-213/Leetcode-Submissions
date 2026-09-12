var sortVowels = function(s) {
    const arr = new Array();

    for (const c of s) 
        if ("AEIOUaeiou".includes(c)) arr.push(c);

    arr.sort();

    let i = 0;
    let sb = "";

    for (const c of s) 
        sb += "AEIOUaeiou".includes(c) ? arr[i++] : c;
    
    return sb;
};
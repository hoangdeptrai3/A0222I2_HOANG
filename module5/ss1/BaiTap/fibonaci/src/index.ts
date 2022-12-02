
function fibonaci(num){
    if (num == 0)
        return 0;
    if (num<=1)
        return 1;
    return fibonaci(num-1) + fibonaci(num-2);
}
let maxNumber = 10;
let sum = 0;
document.write("fibonaci : ");
for (let i = 0; i < maxNumber; i++) {
    document.write(fibonaci(i) + " ");
    sum += fibonaci(i);
}

document.write("<br/> sum : "+sum);


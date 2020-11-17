var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var a = [];
var i,s = 0,sum = 0;
for(i = 0;i < 6;i++){
    a.push(parseFloat(lines.shift()));
}
for(i = 0;i < 6;i++){
    if (a[i] > 0) {
    s++;
    sum = sum + a[i];
  }
}
console.log(s + ' valores positivos');
console.log((sum / s).toFixed(1));

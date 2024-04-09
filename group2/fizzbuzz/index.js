import { FizzBuzz } from './classes/fizzbuzz.js'

for(var i = 1; i <= 100 ; i++ ){
var number = new FizzBuzz(i);
console.log(number.calculate());
}
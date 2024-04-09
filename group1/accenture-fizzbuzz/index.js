import { Numbers } from "./classes/numbers.js";

for (var i = 1; i <= 100 ; i++){
    var num = new Numbers(i);
    console.log(num.calculateFizzBuzz());
}


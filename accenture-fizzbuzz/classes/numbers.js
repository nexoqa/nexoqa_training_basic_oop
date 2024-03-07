export class Numbers {

    #num = 0

    constructor(num){
        this.setNum(num);
    }

    setNum(num){
        if (typeof(num) == "number"){
            this.#num = num;
        }
        else{
            throw Error(num + " is not a number")
        }
    }

    getNum(){
        return this.#num;
    }


    calculateFizzBuzz(){
        var result = "";
        if ((this.#num % 3 == 0) && (this.#num % 5 == 0)){
            result = "FizzBuzz";
        }
        else if (this.#num % 3 == 0){
            result = "Fizz";
        }
        else if (this.#num % 5 == 0){
            result = "Buzz";
        }
        else{
            result = this.#num;
        }
        return result;
    }

}
export class FizzBuzz{

    //Sin # es un atributo público
    //Con # es un atributo privado
    #num = 0

    constructor(num){
        this.#num = num;
    }

    setNum(num){
        this.#num = num;
    }

    getNum(){
        return this.#num;
    }

    calculate(){
        var value = ""
        if (this.#num % 3 == 0){
            value += "Fizz"
        }
        if (this.#num % 5 == 0){
            value += "Buzz"
        }
        if(value == ""){
            value = this.#num;
        }
        return value
    }

}
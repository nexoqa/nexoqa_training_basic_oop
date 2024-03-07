export class StringCalculator{

    #numbers = ""

    constructor(numbers){
        this.setNumbers(numbers);
    }

    setNumbers(numbers){
        if (typeof(numbers) == "string"){
            this.#numbers = numbers;
        }
        else{
            throw Error("Numbers must be a string");
        }
    }

    add(){
        if (this.#numbers == ""){
            return 0;
        }
        else{
            //La función split devuleve las subcadenas al cotar la cadena principal por un caracter
            var nums = this.#numbers.split(",");
            var sum = 0;
            for(var i = 0; i < nums.length ; i++){
                //La función parseInt convierte un string en número entero
                sum = sum + parseInt(nums[i]);
            }
            return sum;
        }
    }

}
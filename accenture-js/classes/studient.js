import { Persona } from "../classes/persona.js"

export class Studient extends Persona{
    
    #id = ""

    constructor(name, surname, dni, address, id){
        super(name, surname, dni, address);
        this.#id = id;
    }

    setId(id){
        if (typeof(id) != "string"){
            throw Error("ID must be a string")
        }
        this.#id = id;
    }

    getId(){
        return this.#id;
    }

    toString(){
        return "{id:" + this.#id + ", " +
               "name:" + this.getName() + ", " +
               "surname:" + this.getSurname() + ", " +
               "dni:" + this.getDni() + ", " +
               "address:" + this.getAddress().toString() + "}";
    }

    identify(){
        return "Studient";
    }


}
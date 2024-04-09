import { Human } from "../classes/human.js"

export class Persona extends Human{

    #name = ""
    #surname = ""
    #dni = ""
    #address = ""

    constructor(name, surname, dni, address){
        super()
        this.setName(name);
        this.setSurname(surname);
        this.setDni(dni);
        this.setAddress(address);
    }

    setName(name){
        if (typeof(name) != "string"){
            throw Error("Name must be a string")
        }
        this.#name = name;
    }

    getName(){
        return this.#name;
    }

    setSurname(surname){
        if (typeof(surname) != "string"){
            throw Error("Surname must be a string")
        }
        this.#surname = surname;
    }

    getSurname(){
        return this.#surname;
    }

    setDni(dni){
        if (typeof(dni) != "string"){
            throw Error("DNI must be a string")
        }
        this.#dni = dni;
    }

    getDni(){
        return this.#dni;
    }

    getAddress(){
        return this.#address;
    }

    setAddress(address){
        if (typeof(address) != "object"){
            throw Error("Address must be an Object")
        }
        this.#address = address;
    }

    toString(){
        return "{name:" + this.#name + ", " +
               "surname:" + this.#surname + ", " +
               "dni:" + this.#dni + ", " +
               "address:" + this.#address.toString() + "}";
    }

    identify(){
        return "Persona";
    }
}
import { Persona } from "../classes/persona.js"

export class Professor extends Persona{

    #department = ""

    constructor(name,surname,dni,address,department){
        super(name,surname,dni,address);
        this.setDepartment(department);
    }

    setDepartment(department){
        this.#department = department;
    }

    getDepartment(){
        return this.#department;
    }

    toString(){
        return "{name:" + this.getName() + ", " +
               "surname:" + this.getSurname() + ", " +
               "dni:" + this.getDni() + ", " +
               "address:" + this.getAddress().toString() +
               "department:" + this.#department + "}";
    }

    identify(){
        return "Professor";
    }

}
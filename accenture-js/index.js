import { Address } from "./classes/address.js"
import { Persona } from "./classes/persona.js";
import { Studient } from "./classes/studient.js";
import { Professor } from "./classes/professor.js";

var address = new Address("calle","ciudad",12345,"pais");

console.log(address.toString());

var persona = new Persona("Juan","Perez","D12345678",address);

console.log(persona.toString());
console.log(persona.identify() );

var studient = new Studient("Alberto","Gonzalez","D123987654",new Address("Parallel","Barcelona",54321,"Spain"), "id-1234");

console.log(studient.toString());
console.log(studient.identify() );

var professor = new Professor("Raul","Gomez","D987654322",new Address("OOOOOO","Ovideo",867856,"Spain"), "id-76544");

console.log(professor.toString());
console.log(professor.identify());

const people = [];
people[0]=persona;
people[1]=studient;
people[2]=professor;

var i = 0;
while ( i < people.length ){

    var human = people[i];
    console.log("Name:" + human.getName());
    console.log("Indentify:" + human.identify());
    i=i+1;

}
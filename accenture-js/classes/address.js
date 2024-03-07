export class Address{

    #street = "";
    #city = "";
    #zipcode = "";
    #country = "";

    constructor(street,city,zipcode,country){
        this.setStreet(street);
        this.setCity(city);
        this.setZipcode(zipcode);
        this.setCountry(country);
    }

    setStreet(street){
        if (typeof(street) != "string"){
            throw Error("Street must be a string")
        }
        this.#street = street;
    }

    getStreet(){
        return this.#street;
    }

    setCity(city){
        if (typeof(city) != "string"){
            throw Error("City must be a string")
        }
        this.#city = city;
    }

    getCity(){
        return this.#city;
    }

    setZipcode(zipcode){
        if (typeof(zipcode) != "number"){
            throw Error("Zipcode must be a number")
        }
        this.#zipcode = zipcode;
    }

    getZipcode(){
        return this.#zipcode;
    }

    setCountry(country){
        if (typeof(country) != "string"){
            throw Error("Country must be a string")
        }
        this.#country = country;
    }

    getCountry(){
        return this.#country;
    }

    toString(){
        return "{street:" + this.#street + ", " +
               "city:" + this.#city + ", " +
               "zipcode:" + this.#zipcode + ", " +
               "country:" + this.#country + "}";
    }
}
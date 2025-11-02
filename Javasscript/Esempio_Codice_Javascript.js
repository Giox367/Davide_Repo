let variabile;

variabile = 1;

variabile = 2;

variabile = "Davide";

variabile = 35

variabile= true;

variabile = 12

if(variabile==12){
    console.log(variabile+15);
}

function somma(a,b){
    return a+b;
    console.log(a+b)
}

console.log(somma(3.8, 4.9))
console.log(somma("ciao sono Davide", 4.9))

let numero = 2; //number 
let stringa = "Davide"; //string
let booleano = true; //boolean
let vuoto = null; //null
let indefinito = undefined; //undefined

let array = ["Davide",12, "Davide", 42]; //array
array.forEach(element => {
    console.log(element)
})
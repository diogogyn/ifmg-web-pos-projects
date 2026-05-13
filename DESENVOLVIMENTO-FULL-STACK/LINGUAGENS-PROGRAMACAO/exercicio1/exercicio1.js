var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

// Lendo as 3 palavras da entrada e removendo espaços em branco (trim)
let p1 = lines.shift().trim();
let p2 = lines.shift().trim();
let p3 = lines.shift().trim();

// Processamento e Saída
if (p1 === "vertebrado") {
    if (p2 === "ave") {
        if (p3 === "carnivoro") {
            console.log("aguia");
        } else if (p3 === "onivoro") {
            console.log("pomba");
        }
    } else if (p2 === "mamifero") {
        if (p3 === "onivoro") {
            console.log("homem");
        } else if (p3 === "herbivoro") {
            console.log("vaca");
        }
    }
} else if (p1 === "invertebrado") {
    if (p2 === "inseto") {
        if (p3 === "hematofago") {
            console.log("pulga");
        } else if (p3 === "herbivoro") {
            console.log("lagarta");
        }
    } else if (p2 === "anelideo") {
        if (p3 === "hematofago") {
            console.log("sanguessuga");
        } else if (p3 === "onivoro") {
            console.log("minhoca");
        }
    }
}
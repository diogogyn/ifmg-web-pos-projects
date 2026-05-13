console.log("Digite 10 números inteiros e pressione Enter após cada um:");

for (let i = 0; i < 10; i++) {
    let input = prompt('Número ' + (i+1) + ' de 10:');
    let X = parseInt(input);
    
    // Se não for número válido, trata como 0 (ou 1, conforme regra)
    if (isNaN(X)) X = 0;
    
    let valor = X <= 0 ? 1 : X;
    console.log(`X[${i}] = ${valor}`);
}
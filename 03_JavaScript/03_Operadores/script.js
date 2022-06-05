// var num1 = prompt('Digite um número')
// var num2 = prompt('Digite outro número')
// var soma = Number(num1) + Number(num2)

// var igual = num1 === num2 ? 'são iguais' : 'não são iguais'
// var comp1 = soma > 10 ? 'maior': 'menor'
// var comp2 = soma < 20 ? 'menor' : 'maior'

// if (!num1 || !num2) {
//     alert('Defina dois números')
    
// } else {
// alert(`Os números ${num1} e ${num2} ${igual}. Sua soma é ${soma}, que é ${comp1} que 10 e ${comp2} que 20`)
// }

function validanumero(num){
    if(!num) return "envie um numero valido";
    return num;
}
console.log(validanumero());
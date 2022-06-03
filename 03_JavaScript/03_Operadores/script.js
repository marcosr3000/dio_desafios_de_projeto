var a = prompt('Digite um número')
var b = prompt('Digite outro número')
var a2 = Number(a)
var b2 = Number(b)
var soma = a2 + b2

var igual = a == b ? 'são iguais' : 'não são iguais'


var comp1 = soma > 10 ? 'maior': 'menor'


var comp2 = soma < 20 ? 'menor' : 'maior'

alert(`Os números ${a2} e ${b2} ${igual}. Sua soma é ${soma}, que é ${comp1} que 10 e ${comp2} que 20`)
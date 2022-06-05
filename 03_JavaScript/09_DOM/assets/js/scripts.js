const botao = document.getElementById('mode-selector')
const corpo = document.getElementsByTagName('body')[0]
const titulo = document.getElementById('page-title')
const footer = document.getElementsByTagName('footer')[0]
const darkModeClass = 'dark-mode'

botao.addEventListener('click', clicar)

function clicar() {
    changeClasses();
    changeText();    
}

function changeClasses() {
    botao.classList.toggle(darkModeClass);
    corpo.classList.toggle(darkModeClass);
    titulo.classList.toggle(darkModeClass);
    footer.classList.toggle(darkModeClass);
}

function changeText() {
    if (corpo.classList.contains(darkModeClass)) { 
        botao.innerHTML = 'Light Mode';
        titulo.innerHTML = 'Dark Mode ON'
        return;
    }
    botao.innerHTML = 'Dark Mode';
    titulo.innerHTML = 'Light Mode ON';
}







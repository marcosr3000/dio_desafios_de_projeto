const BASE_URL = 'https://thatcopy.pw/catapi/rest/'
const catBtn = document.getElementById('change-cat');


const getCats = async () => {
    try {
        const data = await fetch(BASE_URL);
        const json = await data.json();

        return json.webpurl;
        
    } catch (e) {
        console.log(e.message);
    }
};

const loadImg = async () => {
    const catImg = document.getElementById('cat');
    catImg.src = await getCats();
}

catBtn.addEventListener('click', loadImg);

loadImg();



// const botao = document.querySelector('#change-cat')
// botao.addEventListener('click', clicar)
// function clicar () {

// fetch('https://thatcopy.pw/catapi/rest')
//     .then(response => {
//         return response.json()
//     })
//     .then(async data => {
//         const imagemCat = await fetch ('https://thatcopy.pw/catapi/rest')
//         const image = await imagemCat.json()
//         querySelector('#cat').src = image.url

//     })

// }
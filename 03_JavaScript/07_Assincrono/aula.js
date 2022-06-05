async function resolvePromise() {
    const myPromise = new Promise((resolve, reject) => {
        window.setTimeout(() => {
            resolve('Resolvida!');
        }, 3000);
    });

    const resolved = await myPromise
        .then(async (result) => result + ' passando pleo then')
        .then(async (result) => result + ' e agora acabou!')
        .catch((err) => console.log(err.message));
    
    return resolved;
}

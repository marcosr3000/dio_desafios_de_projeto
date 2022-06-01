function add() {
    var todo = document.getElementById('field');
    var list = document.getElementById('list');
    var todo2 = todo.value

    list.insertAdjacentHTML('beforeend', `
    <input type="checkbox" id="${todo2}">
    <label class="checkbox" for="${todo2}">
    ${todo2}<br>
    </label>`)

    document.getElementById('field').value = '';
}
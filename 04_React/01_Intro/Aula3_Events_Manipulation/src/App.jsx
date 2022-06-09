import React from "react";
import mock from './mock'
import Button from './components/Button'
//------------- -----------------------------------

const App2 = () => {

    const name = 'Digital Innovation One'

    const handleChange = (e) => {
        const { value } = e.target
        console.log(value)
    }

    const showEvent = (e) => {
        console.log('evento clicado')
        console.log(e)
        alert(name)
    }
    const Button = <button onClick={showEvent}>Mostrar evento</button>

    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Bem vindo a nossa aula =D.</p>
            <input onChange={handleChange} />
            {Button}
        </div>
    );
};
//------------- -----------------------------------


const App = () => {

    const handleClick = (id) => {
        console.log('deletar cliente')
        alert(`ID do cliente: ${id}`)
    }

    const renderCustomers = (customer, index) => {
        return (
            <div key={`customer-${customer.id}`}>
            <li>{customer.name} <Button onClick={() => handleClick(customer.id)}>Deletar o Cliente</Button></li>
            {customer.skill.map(renderSkills)}

            </div>
        )
    }

    const renderSkills = (skill, index) => {
        return (
            <div style={{ paddingLeft: '30px' }} key={`skill-${index}`}>
            <li>{skill}</li>
            </div>
        )
    }

    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Bem vindo a nossa aula =D.</p>
            <ul>
                {mock.map(renderCustomers)}
            </ul>
        </div>
    );
};
//------------- -----------------------------------
export default App;
import React from "react";
//------------- -----------------------------------

const listCustomer = [
    {
        id: 1,
        name: 'Marcos Roberto',
        skill: ['React', 'Node', 'CSS', 'Webpack']       
    },
    {
        id: 2,
        name: 'Mateus de Assis',     
        skill: ['HTML', 'React Native', 'Go', 'JS']  
    },
    {
        id: 3,
        name: 'Diva de Fátima',
        skill: ['Assembly']       
    },
    {
        id: 4,
        name: 'Euripedes de Assis',  
        skill: ['Reason']     
    },
    
]

const App = () => {

    const renderCustomers = (customer, index) => {
        return (
            <div key={`customer-${customer.id}`}>
            <li>{customer.name}</li>
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
                {listCustomer.map(renderCustomers)}
            </ul>
        </div>
    );
};
//------------- -----------------------------------
export default App;
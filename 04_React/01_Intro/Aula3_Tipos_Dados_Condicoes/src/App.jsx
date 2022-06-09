import React from "react";
//-------------IF inline com && -----------------------------------
const buttonA = <button>Histórico dos clientes</button>

const buttonB = <button>Segundo botão</button>

const hasCustomer = true

const App2 = () => {
    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Bem vindo a nossa aula =D.</p>
            
            {hasCustomer && (
            <div>
                Clique no botão abaixo para visualizar o histórico dos clientes
                <br />
                {buttonA}   
            </div>
            )}
        </div>
    );
};
//-------------IF com ternário-----------------------------------
const buttonC = <button>Histórico dos clientes</button>

const buttonD = <button>Cadastrar cliente</button>

const hasCustomerB = true

const App3 = () => {

    const renderShowHistory = () => (
        <div>
            Clique no botão abaixo para visualizar o histórico dos clientes
            <br />
            {buttonC}   
        </div>
    )

    const renderAddCustomer = () => (
        <div>
            Clique abaixo para cadastrar o cliente
            <br />
            {buttonD}
        </div>    
    )

    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Bem vindo a nossa aula =D.</p>
            
            {hasCustomerB ? renderShowHistory() : renderAddCustomer()}
        </div>
    );
};
//----------Evitando que um componente seja renderizado----------------

const buttonE = <button>Histórico dos clientes</button>

const buttonF = <button>Cadastrar cliente</button>

const hasCustomerC = false

const App = () => {

    const renderShowHistory = () => (
        <div>
            Clique no botão abaixo para visualizar o histórico dos clientes
            <br />
            {buttonE}   
        </div>
    )

    const renderAddCustomer = () => (
        <div>
            Clique abaixo para cadastrar o cliente
            <br />
            {buttonF}
        </div>    
    )

    

    const showCustomer = () => {
        if (!hasCustomerC) return null

        return (
            <div>
                <h1>Nome do Cliente: Marcos Roberto</h1>
            </div>
        )
    }
    
    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Bem vindo a nossa aula =D.</p>
            
            {hasCustomerC ? renderShowHistory() : renderAddCustomer()}
            <div>
                {showCustomer()}
            </div>
        </div>
    );
};
//------------- -----------------------------------
export default App;
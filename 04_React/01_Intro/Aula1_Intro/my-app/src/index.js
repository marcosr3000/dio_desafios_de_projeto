import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import Button from './Button'
import ComponentA from './ComponentA'
import './index.css';
//-------------------------------------------------
function sum(a,b) {
  return a + b
}

function primeiroJSX() {
  return (
    <div className="teste">
      Marcos Roberto - Introdução ao ReactJS
      <h1>Soma: {sum(10, 20)}</h1> 
    </div>
  )
}
//-------------------------------------------------
const element = 'Digital Innovation'
const element2 = <h1>Olá Turma =D</h1>

function App2() {
  return (
    <div>
      {element}
      {element2}
    </div>
  )
}
//----------------Children---------------------------------
function soma(a, b) {
  alert(a + b)
}

function App () {

  return (
      <div className = "App">
          Hello, World <br></br>
          <Button onClick={() => soma(10, 20)} name="Marcos Roberto" /><br></br>
          <ComponentA>
            <Button onClick={() => soma(30, 20)} name="Assis" />
          </ComponentA>
      </div>
  )
}
//---------------Life Cycle----------------------------------
class App3 extends Component {

  constructor(props) {
    super(props)

    this.state = {
      clock: 1000,
      copo: 'água'
    }
  }

  componentDidMount() {
    window.setTimeout(() => {
      this.setState({
        copo: 'suco'
      })
    },3000)
  }

  alterarCopo = () => {
    this.setState({
      copo: 'refigerante'
    })
  } 

  render() {
    const { clock, copo } = this.state
    return (
    <div>
      <h1>{clock}</h1>
      <button onClick={() => this.alterarCopo()}><h1>{copo}</h1></button>
    </div>
    )
  }

}

//-------------------------------------------------
const rootElement = document.getElementById("root")
ReactDOM.render(<App3 />, rootElement)

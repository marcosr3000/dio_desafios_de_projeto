import React, { Children } from 'react'

function ComponentA(props) {
    return (
        <div>Meu componente
            <div>{props.children}</div>
        </div>
    )
}

export default ComponentA
import React from 'react'
import { Link } from 'react-router-dom';


export default function Home() {
  return (
    <div>
      <h1>Bienvenido al Evento</h1>
      <div className="container">
        <div className="card">
          <img src="logo192.png" className="card-img-top" alt="logo" />
          <div className="card-body">
            <h5 className="card-title">Evento 1</h5>
            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            
            <Link className="btn btn-primary" to={"/asientos"}>Comprar Asientos</Link>
          </div>
        </div>


      </div>
    </div>
  )
}

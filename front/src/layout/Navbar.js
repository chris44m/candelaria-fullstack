import React from 'react'

export default function Navbar() {
    return (
        <div>

                <nav className="navbar navbar-expand-lg navbar-dark bg-primary" >
                    <div className="container-fluid">
                        <a className="navbar-brand" href="#">Candelaria</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div className="navbar-nav">
                                <a className="nav-link active" aria-current="page" href="#">Inicio</a>
                                <a className="nav-link" href="#">Eventos</a>
                                <a className="nav-link" href="#">Precios</a>
                            </div>
                        </div>
                        <button className="btn btn-outline-light">Contactanos</button>
                    </div>
                </nav>


        </div>
    )
}

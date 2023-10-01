import axios from 'axios';
import React, { useState, useEffect } from 'react';


export default function Asientos() {
  
  const [asientos, setAsientos] = useState([]);
  const [seatsToBuy, setSeatsToBuy] = useState([]);

  useEffect(() => {
    // Realizar una solicitud GET al backend para obtener la lista de asientos disponibles
    axios.get('http://localhost:8080/asiento')
      .then((response) => {
        setAsientos(response.data);
      })
      .catch((error) => {
        console.error('Error al obtener la lista de asientos', error);
      });
  }, []);

  const toggleSeatSelection = (seatId) => {
    // Función para alternar la selección de asientos
    if (seatsToBuy.includes(seatId)) {
      // Si el asiento ya está seleccionado, quitarlo de la lista
      setSeatsToBuy(seatsToBuy.filter((seat) => seat !== seatId));
    } else {
      // Si el asiento no está seleccionado, agregarlo a la lista
      setSeatsToBuy([...seatsToBuy, seatId]);
    }
  };

  const handleBuyClick = () => {
    // Redirigir a la página de compra y enviar la lista de asientos seleccionados
    // Utiliza una biblioteca de enrutamiento como React Router para la navegación
    // Puedes pasar los asientos seleccionados como parte de la ruta o como parámetro de consulta
    // Ejemplo con React Router: history.push(`/compra?seats=${seatsToBuy.join(',')}`);
  };

  return (
    <div>
      <h2>Asientos Disponibles</h2>
      <ul>
        {asientos.map((asiento) => (
          <li key={asiento.id}>
            <span>Asiento {asiento.numero}</span>
            <span>Precio: ${asiento.precio}</span>
            <button
              onClick={() => toggleSeatSelection(asiento.id)}
              className={seatsToBuy.includes(asiento.id) ? 'selected' : ''}
            >
              Seleccionar
            </button>
          </li>
        ))}
      </ul>
      <button onClick={handleBuyClick}>Comprar</button>
    </div>
  );

}


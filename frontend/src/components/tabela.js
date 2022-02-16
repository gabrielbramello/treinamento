import React, { useEffect, useState } from 'react';

const Tabela = () => {

    const [rows, setRows] = useState([]);

    useEffect(() => {
        //fetch API
        //setRows
    }, [])


    const itens = [
        { id: 1, nomeTrabalhador: 'João', CPF: '03388814432', tipoEvento: '2200', status: 'PENDENTE', acao: 'INCLUSAO' },
        { id: 2, nomeTrabalhador: 'João', CPF: '03388814432', tipoEvento: '2200', status: 'PENDENTE', acao: 'INCLUSAO' },
        { id: 3, nomeTrabalhador: 'João', CPF: '03388814432', tipoEvento: '2200', status: 'PENDENTE', acao: 'INCLUSAO' },
        { id: 4, nomeTrabalhador: 'João', CPF: '03388814432', tipoEvento: '2200', status: 'PENDENTE', acao: 'INCLUSAO' }
    ]


    return (
        <div className='tabela'>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>CPF</th>
                        <th>Tipo</th>
                        <th>Status</th>
                        <th>Ação</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        itens.map((item) => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.nomeTrabalhador}</td>
                                <td>{item.CPF}</td>
                                <td>{item.tipoEvento}</td>
                                <td>{item.status}</td>
                                <td>{item.acao}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>

    )
}

export default Tabela;
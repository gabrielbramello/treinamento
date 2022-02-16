import React, { useEffect, useState } from 'react';


const Form = () => {

    const [nomeTrabalhador, setNomeTrabalhador] = useState('Insira o nome')
    const [CPF, setCPF] = useState('insira o CPF');
    const [tipoTrabalhador, setTipoTrabalhador] = useState([]);

    useEffect(() => {
        //fetch API
    }, [])


    function handleSubmitForm(e){
        e.preventDefault();
        console.log('Request to API');
    }

    return (
        <div className='formulario-container'>
            <form className='formulario' onSubmit={handleSubmitForm}>
                <div className='formulario-item'>
                    <span className='label'>Nome do Trabalhador</span>
                    <input type={'text'} value={nomeTrabalhador} onChange={() => console.log('changed')} />
                </div>
                <div className='formulario-item'>
                    <span className='label'>CPF</span>
                    <input type={'text'} value={CPF} onChange={() => console.log('changed')} />
                </div>
                <div className='formulario-item'>
                    <span className='label'>Tipo Evento</span>
                    <select name="cars" id="cars">
                        <option value="2200">2200 - Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador</option>
                        <option value="2299">2299 - Desligamento</option>
                        <option value="2300">2300 - Trabalhador Sem Vínculo de Emprego/Estatutário - Início</option>
                        <option value="2399">2399 - Trabalhador Sem Vínculo de Emprego/Estatutário - Término</option>
                    </select>
                </div>
                <div className='formulario-item'>
                    <span className='label'>Status</span>
                    <select name="cars" id="cars">
                        <option value="pendente">PENDENTE</option>
                        <option value="recebido">RECEBIDO</option>
                        <option value="rejeitado">REJEITADO</option>
                    </select>
                </div>
                <div className='formulario-item'>
                    <span className='label'>Ação</span>
                    <select name="cars" id="cars">
                        <option value="inclusao">INCLUSAO</option>
                        <option value="alteracao">ALTERACAO</option>
                        <option value="exclusao">EXCLUSAO</option>
                    </select>
                </div>
                <div>
                    <button>Cadastrar</button>
                </div>
            </form>
        </div>
    )
}

export default Form
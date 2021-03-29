import axios from 'axios';

const API_URL = 'http://localhost:8080/'

class PessoasDataService{

    retriveAllPessoas(){
        return axios.get(`${API_URL}pessoas`);
    }

    updatePessoa(pessoa, codigo){
        return axios.put(`${API_URL}pessoas/${codigo}`, pessoa);
    }

}
    
    export default  new PessoasDataService();
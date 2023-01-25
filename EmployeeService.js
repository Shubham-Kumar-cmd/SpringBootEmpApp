import axios from 'axios';

const URL="http://localhost:8090/employees";

class EmployeeService{

    //1. fetch all employee JSON data
    getAllEmployees(){
        return axios.get(`${URL}/all`);
    }

    //2. delete employee by id
    deleteEmployee(id){
        return axios.delete(`${URL}/remove/${id}`);
    }
}

export default new EmployeeService();
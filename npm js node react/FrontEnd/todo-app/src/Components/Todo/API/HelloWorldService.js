import axios from "axios"

export function retrieveHelloWorld() {
	return axios.get('http://localhost:8080/hello-world')
}

export function retrieveHelloWorldWithName(current_name) {
	return axios.get(`http://localhost:8080/hello-world/name/${current_name}`)
}


export default retrieveHelloWorld
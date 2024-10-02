import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { useAuth } from "./security/AuthProvider"
function LoginComponent() {

    const [userName, setUserName] = useState('UserName');
    const [password, setPassword] = useState('');
    const [successValidation, setsuccessValidation] = useState(false);
    const [errorValidation, setErrorValidation] = useState(false);
    const navigate = useNavigate();
    const authContext = useAuth();


    function handleUsernameChange(event) { setUserName(event.target.value); }
    function handlePasswordChange(event) { setPassword(event.target.value); }

    function handleValidation() {
        if (userName === 'RAJ ROY' && password === '12345') {
            authContext.setAuthenticated(true);
            setsuccessValidation(true);
            setErrorValidation(false);
            navigate(`/welcome/${userName}`);
        } 
        else {
            authContext.setAuthenticated(false);
            setsuccessValidation(false);
            setErrorValidation(true);
        }
    }
    return (
        <div className = "Login">
            <h1> Login Please! </h1>
            {successValidation  && <div> Successfully logged in. </div>}
            {errorValidation && <div> Incorrect userName or Password please check your credentials. </div>}
            <div className = "LoginForm">
                <div>
                    <label> userName </label>
                    <input
                        type = "text"
                        name = "userName"
                        value = {userName}
                        onChange = {handleUsernameChange}
                    ></input>
                </div>
                <div>
                    <label> Password </label>
                    <input
                        type = "password"
                        name = "Password"
                        value = {password}
                        onChange = {handlePasswordChange}
                    ></input>
                </div>
                <div>
                    <button type = "button" onClick = {handleValidation}>
                        Login
                    </button>
                </div>
            </div>
        </div>
    );
}

export default LoginComponent;
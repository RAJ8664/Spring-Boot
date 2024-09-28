import './TodoApp.css';
import { useState } from 'react';

export default function TodoApp() {
    return (
        <div>
            <LoginComponent> </LoginComponent>
            {/* <WelcomeComponent></WelcomeComponent> */}
        </div>
    );
}

function LoginComponent() {
    const [userName, setUserName] = useState('UserName');
    const [password, setPassword] = useState('');
    const [successValidation, setsuccessValidation] = useState(false);
    const [errorValidation, setErrorValidation] = useState(false);

    function handleUsernameChange(event) {
        setUserName(event.target.value);
    }

    function handlePasswordChange(event) {
        setPassword(event.target.value);
    }

    function CheckValidation() {
        if (userName === 'RAJ ROY' && password === '12345') {
            setsuccessValidation(true);
            setErrorValidation(false);
        } 
        else {
            setsuccessValidation(false);
            setErrorValidation(true);
        }
    }

    function CheckedValidationSuccess() {
        if (successValidation) {
            return (
                <div className = "checkedValidation">
                    Successfully logged in.
                </div>
            );
        }
        return null;
    }

    function CheckedValidationError() {
        if (errorValidation) {
            return (
                <div className = "checkedValidation">
                    Incorrect userName or Password check your credentials.
                </div>
            );
        }
        return null;
    }

    return (
        <div className = "Login">
            <CheckedValidationSuccess />
            <CheckedValidationError />
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
                    <button type = "button" onClick = {CheckValidation}>
                        Login
                    </button>
                </div>
            </div>
        </div>
    );
}




// function WelcomeComponent() {
//   return (
//     <div className = "Welcome">WelCome Component</div>
//   );
// }




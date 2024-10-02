import './TodoApp.css'
import { BrowserRouter, Routes, Route} from 'react-router-dom'
import HeaderComponent from "./HeaderComponent"
import FooterComponent from "./FooterComponent"
import ListTodoComponent from "./ListTodoComponent"
import ErrorComponent from "./ErrorComponent"
import LoginComponent from "./LoginComponent"
import LogOutComponent from "./LogoutComponent"
import WelcomeComponent from "./WelcomeComponent"
import AuthProvider from "./security/AuthProvider"

export default function TodoApp() {
    return (
        <div>
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent />
                    <Routes>
                        <Route path = "/" element = { <LoginComponent /> } />    
                        <Route path = "/login" element = { <LoginComponent /> } />
                        <Route path = "/welcome/:userName" element = { <WelcomeComponent /> } />
                        <Route path = "/todos" element = { <ListTodoComponent /> } />
                        <Route path = "/logout" element = { <LogOutComponent /> } />
                        <Route path = "*" element = { <ErrorComponent /> } />
                    </Routes>
                    <FooterComponent />
                </BrowserRouter>
            </AuthProvider>
        </div>
    );
}
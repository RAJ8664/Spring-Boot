import './TodoApp.css';
import { Navigate, BrowserRouter, Routes, Route } from 'react-router-dom';
import HeaderComponent from './HeaderComponent';
import FooterComponent from './FooterComponent';
import ListTodoComponent from './ListTodoComponent';
import ErrorComponent from './ErrorComponent';
import LoginComponent from './LoginComponent';
import LogOutComponent from './LogoutComponent';
import WelcomeComponent from './WelcomeComponent';
import AuthProvider from './security/AuthProvider';
import { useAuth } from './security/AuthProvider';

function AuthenticatedRoute({ children }) {
    const authContext = useAuth();
    if (authContext.Authenticated) return children;
    return <Navigate to="/login"> </Navigate>;
}

export default function TodoApp() {
    return (
        <div>
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent />
                    <Routes>
                        <Route path="/" element={<LoginComponent />} />
                        <Route path="/login" element={<LoginComponent />} />
                        <Route
                            path="/welcome/:userName"
                            element={
                                <AuthenticatedRoute>
                                    <WelcomeComponent />
                                </AuthenticatedRoute>
                            }
                        />
                        <Route
                            path="/todos"
                            element={
                                <AuthenticatedRoute>
                                    <ListTodoComponent />
                                </AuthenticatedRoute>
                            }
                        />
                        <Route
                            path="/logout"
                            element={
                                <AuthenticatedRoute>
                                    <LogOutComponent />
                                </AuthenticatedRoute>
                            }
                        />
                        <Route path="*" element={<ErrorComponent />} />
                    </Routes>
                    <FooterComponent />
                </BrowserRouter>
            </AuthProvider>
        </div>
    );
}

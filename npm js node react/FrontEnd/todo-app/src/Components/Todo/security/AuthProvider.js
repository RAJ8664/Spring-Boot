import { createContext } from 'react';
import { useState } from 'react';
import { useContext } from 'react';

export const AuthContext = createContext();
export const useAuth = () => useContext(AuthContext);

function AuthProvider({ children }) {
    const [Authenticated, setAuthenticated] = useState(false);

    function login(userName, password) {
        if (userName === 'RAJ ROY' && password === '12345') {
            setAuthenticated(true);
            return true;
        } else {
            setAuthenticated(false);
            return false;
        }
    }

    function logout() {
        setAuthenticated(false);
    }

    return (
        <AuthContext.Provider value={{ Authenticated, login, logout }}>
            {children}
        </AuthContext.Provider>
    );
}

export default AuthProvider;

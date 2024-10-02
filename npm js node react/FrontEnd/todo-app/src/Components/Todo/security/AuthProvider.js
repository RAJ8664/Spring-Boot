import { createContext } from "react"
import { useState } from "react";
import { useContext } from "react";

export const AuthContext = createContext();
export const useAuth = () => useContext(AuthContext);

function AuthProvider({children}) {
	const [Authenticated, setAuthenticated] = useState(false);
	return (
		<AuthContext.Provider value={ { Authenticated, setAuthenticated} }>
			{children}
		</AuthContext.Provider>
	);
}

export default AuthProvider;
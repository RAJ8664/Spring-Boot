import { Link } from 'react-router-dom'
import {useAuth} from './security/AuthProvider'

function HeaderComponent() {
    const authContext = useAuth();
    const isAuthenticated = authContext.Authenticated;

    function changeLogout() {
        authContext.setAuthenticated(false);
    }

    return (
        <header className = "header bg-dark">
            <div className = "container">
                <nav className = "navbar navbar-expand-lg navbar-dark">
                    <a className = "navbar-brand" href = "https://github.com/RAJ8664">
                        <span className = "h4 mb-0 text-light"> R-TODO </span>
                    </a>
                    <button className = "navbar-toggler" type = "button" data-toggle = "collapse" data-target = "#navbarNav" aria-controls = "navbarNav" aria-expanded = "false" aria-label = "Toggle navigation">
                        <span className = "navbar-toggler-icon"></span>
                    </button>
                    <div className = "collapse navbar-collapse" id = "navbarNav">
                        <ul className = "navbar-nav mr-auto">
                            <li className = "nav-item">
                                {isAuthenticated && <Link className = "nav-link text-light" to = "/todos"> Todos </Link>}
                            </li>
                        </ul>
                        <ul className = "navbar-nav ml-auto">
                            <li className = "nav-item">
                                {!isAuthenticated && <Link className = "nav-link text-light" to = "/login"> Login </Link>}
                            </li>
                            <li className="nav-item">
                                {isAuthenticated && <Link className="nav-link text-light" to = "/logout" onClick={changeLogout}> Logout </Link>}
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </header>
    );
}

export default HeaderComponent
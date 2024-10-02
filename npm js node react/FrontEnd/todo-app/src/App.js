import './App.css';
import AuthProvider from './Components/Todo/security/AuthProvider';
import TodoApp from './Components/Todo/TodoApp';

function App() {
    return (
        <AuthProvider>
            <div className="App">
                <TodoApp />
            </div>
        </AuthProvider>
    );
}

export default App;

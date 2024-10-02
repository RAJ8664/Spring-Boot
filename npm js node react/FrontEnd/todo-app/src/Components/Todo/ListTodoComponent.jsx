import { useAuth } from "./security/AuthProvider";
function ListTodoComponent() {
    const today = new Date();
    const targetdate = new Date(today.getFullYear() + 10 , today.getMonth() , today.getDay());
    const todos = [
                    {id : 1, description : "Learn Spring" , done : false, targetDate : targetdate},
                    {id : 2, description : "Learn Java", done : false, targetDate : targetdate},
                    {id : 3, description : "Learn Spring Boot", done : false, targetDate : targetdate}
                ];

    const authContext = useAuth();
    const isAuthenticated = authContext.Authenticated;
    return ( authContext.Authenticated &&
        <div className = "container">
            <h1> Things you want to add to your Todo List</h1>
            <div> 
                <table className = "table">
                    <thead>
                        <tr>
                            <td> ID </td>
                            <td> Description </td>
                            <td> Is Done</td>
                            <td> TargetDate </td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            todos.map(todo => (
                                <tr key = {todo.id}>
                                    <td> {todo.id} </td>
                                    <td> {todo.description} </td>
                                    <td> {todo.done.toString()} </td>
                                    <td> {todo.targetDate.toDateString()} </td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default ListTodoComponent

import { useParams, Link } from 'react-router-dom';
import { useState } from 'react';
import retrieveHelloWorld from './API/HelloWorldService';
import {retrieveHelloWorldWithName} from './API/HelloWorldService'

function WelcomeComponent() {
    const params = useParams();
    const [message, setMessage] = useState(null);
    const [nameMessage, setnameMessage] = useState(null);

    function callhelloworldapi() {
        retrieveHelloWorld()
            .then( (response) => successfulResponse(response))
            .catch( (error) => errorResponse(error))
            .finally( () => console.log('cleaup'));
    }

    function callNameHelloWorld() {
        retrieveHelloWorldWithName("RAJ ROY")
            .then( (response) => nameSuccessfulMessage(response))
            .catch( (error) => nameFailedMessage(error))
            .finally( () => console.log("cleaned up"))
    }

    function nameFailedMessage(error) {
        console.log(error);
    }
    function nameSuccessfulMessage(response) {
        setnameMessage(response.data);
    }

    function successfulResponse(response) {
        console.log(response);
        setMessage(response.data);
    }

    function errorResponse(error) {
        console.log(error);
    }

    return (
        <div>
            <h1> Welcome to Todo Application {params.userName}</h1>
            <div>
                Manage your Todo <Link to = "/todos"> HERE </Link>
            </div>
            <div>
                <buttton className="restbutton" onClick={callhelloworldapi}>
                    {' '}
                    Hello-world{' '}
                </buttton>
                
                <buttton className="restbutton" onClick={callNameHelloWorld}>
                    {' '}
                    Hello-world-with-name{' '}
                </buttton>
            </div>
            <div className = "text-info"> {message} </div>
            <div className = "text-info"> {nameMessage} </div>
        </div>
    );
}

export default WelcomeComponent;

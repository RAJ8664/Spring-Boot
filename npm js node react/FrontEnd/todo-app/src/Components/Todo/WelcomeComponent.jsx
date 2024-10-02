import {useParams, Link} from 'react-router-dom'

function WelcomeComponent() {
    const params = useParams();
  return (
    <div>
        <h1>Welcome to Todo Application {params.userName}</h1>
        <div>
            Manage your Todo <Link to = "/todos"> HERE </Link>
        </div>
    </div>
  );
}

export default WelcomeComponent
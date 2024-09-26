import './App.css';
import FirstComponent from './Components/ExampleComponents/FirstComponent'
import SecondComponent from './Components/ExampleComponents/SecondComponent'
import {ThirdComponent} from './Components/ExampleComponents/FirstComponent';

function App() {
  return (
    <div className="App">
      <FirstComponent></FirstComponent>
      <SecondComponent></SecondComponent>
      <ThirdComponent></ThirdComponent>
    </div>
  );
}

export default App;

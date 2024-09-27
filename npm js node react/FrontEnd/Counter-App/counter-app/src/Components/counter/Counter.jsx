import './Counter.css'
import {useState} from 'react'
export default function Counter() {
    const [count, counterFunction] = useState(0);
    function IncrementFunctionParent(by){
        counterFunction(count + by);
    } 
    function DecrementFunctionParent(by)  {
        counterFunction(count - by);
    } 

    function ResetButtonPressed() {
        counterFunction(count * 0);
    }
    return (
       <div>
             <div>
            <span className = "totalcount"> {count} </span>
            <CounterButton 
                p1 = {1} 
                incrementMethod = {IncrementFunctionParent} 
                decrementMethod = {DecrementFunctionParent}>
            </CounterButton>
            <CounterButton 
                p1 = {2} 
                incrementMethod = {IncrementFunctionParent} 
                decrementMethod = {DecrementFunctionParent}>
            </CounterButton>
            <CounterButton 
                p1 = {5} 
                incrementMethod = {IncrementFunctionParent} 
                decrementMethod = {DecrementFunctionParent}>
            </CounterButton>
        </div>
        <div>
            <button className = "ResetButton" onClick={ResetButtonPressed}> RESET </button>    
        </div>
       </div>
    );
}

function CounterButton({p1 , incrementMethod, decrementMethod}) {
    const [count , counterFunction] = useState(0);
     function IncrementCounter() {
        counterFunction(count + p1) 
        incrementMethod(p1);
    }
    function DecrementCounter() {
        incrementMethod(p1); 
        decrementMethod(p1);
    }
    return (
        <div className = "Counter">
            <div>
                <button className = "counterButtonStyle" onClick = {IncrementCounter}
                > + {p1} </button>
                <button className = "counterButtonStyle" onClick = {DecrementCounter}> - {p1} </button>
            </div>
        </div>
    );
}
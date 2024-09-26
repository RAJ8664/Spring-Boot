import './Counter.css'
export default function Counter() {

    function IncrementCounter() {
        console.log("Increment Button Pressed");
    }


    return (
        <div className = "Counter">
            <span className = "count"> 0 </span>
            <div>
                <button className = "counterButtonStyle" onClick = {IncrementCounter}
                > +1 </button>
            </div>
        </div>
    )
}
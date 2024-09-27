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
                <button className = "counterButtonStyle" onClick = {IncrementCounter}> + 2</button>
            </div>
            <div>
                <button className = "counterButtonStyle"
                    onClick = {IncrementCounter}
                > +3
                </button>
                 <button className = "counterButtonStyle"
                    onClick = {IncrementCounter}
                > +4
                </button>
            </div>


        </div>
    )
}
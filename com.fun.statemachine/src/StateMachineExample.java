import com.fun.statemachine.statemachine.CompositeState;
import com.fun.statemachine.statemachine.StatemachineFactory;
import com.fun.statemachine.statemachine.Transition;

public class StateMachineExample {

	public static void main(String[] args) {
		StatemachineFactory factory = StatemachineFactory.eINSTANCE;
		
		CompositeState switchState = factory.createCompositeState();
		switchState.setName("Switch");
		
		CompositeState onState = factory.createCompositeState();
		onState.setName("On");
		switchState.getSubstate().add(onState);
		
		CompositeState offState = factory.createCompositeState();
		offState.setName("Off");
		switchState.getSubstate().add(offState);
		
		Transition onOff = factory.createTransition();
		
		Transition offOn = factory.createTransition();

	}

}

package code.trickshacks.thrower;

import java.rmi.RemoteException;

public class ThrowerMain {

	public static void main(String[] args) {
		// throw new RemoteException(); // checked exception, compile error.
		Thrower.spit(new RemoteException("go unchecked!")); // just works fine.
	}

}

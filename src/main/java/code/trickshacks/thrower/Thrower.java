package code.trickshacks.thrower;

public class Thrower {
	public static void spit(final Throwable exception) {
		class EvilThrower<T extends Throwable> {
			@SuppressWarnings("unchecked")
			private void sneakyThrow(Throwable exception) throws T {
				throw (T) exception;
			}
		}
		new EvilThrower<RuntimeException>().sneakyThrow(exception);
	}
}


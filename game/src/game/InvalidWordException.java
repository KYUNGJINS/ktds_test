package game;

/**
 * 3자리 미만의 단어를 입력했으 경우 던질 예외
 */
public class InvalidWordException extends RuntimeException {

	private static final long serialVersionUID = -7037212777087331376L;

	public InvalidWordException() {
		super();
	}
}

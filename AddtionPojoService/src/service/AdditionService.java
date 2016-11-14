package service;

public class AdditionService implements AdditionServiceInterface{

	@Override
	public int addTwo(int a, int b) {
		return a+b;
	}

	@Override
	public int deleteTwo(int a, int b) {
		return a-b;
	}

}

package cn.zjz.ssm.factory.abstractFactory;

public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}


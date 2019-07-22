package cn.zjz.ssm.mediator;

public interface Mediator {
	
	void register(String dname, Department d);
	
	void command(String dname);
	
}

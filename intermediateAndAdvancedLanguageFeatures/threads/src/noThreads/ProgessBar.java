package noThreads;

public class ProgessBar {
public void execute() {
	for(int i = 0; i < 10000; i++){
		System.out.println("Progess bar ... wait " + i);
	}
}
}

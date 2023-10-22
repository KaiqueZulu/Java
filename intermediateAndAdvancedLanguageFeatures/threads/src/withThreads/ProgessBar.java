package withThreads;

public class ProgessBar implements Runnable{
@Override
public void run() {
	for(int i = 0; i < 10000; i++){
		System.out.println("Progess bar ... wait " + i);
	}
}
}

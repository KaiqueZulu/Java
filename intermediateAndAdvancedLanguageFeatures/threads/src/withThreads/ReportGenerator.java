package withThreads;

public class ReportGenerator implements Runnable {
@Override
public void run() {
	for(int i = 0; i < 10000; i++){
		System.out.println("Report generator ... wait " + i);
	}
}
}

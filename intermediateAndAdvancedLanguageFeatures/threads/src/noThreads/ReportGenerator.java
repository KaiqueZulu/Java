package noThreads;

public class ReportGenerator {
public void execute() {
	for(int i = 0; i < 10000; i++){
		System.out.println("Report generator ... wait " + i);
	}
}
}

import java.io.File

public class WriteContent {
	static void main(String[] args) {
		  new File('', 'Example1.txt').withWriter('utf-8') {
			  writer -> writer.writeLine 'Hello World';
		  }
	}
}

import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("Example.txt").eachLine {  
         line -> println "line : $line"; 
		 
		File file = new File("Example.txt");
		println "The file ${file.absolutePath} has ${file.length()} bytes";
		
		def f = new File('/Users/yashkumar.chandaliya/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/');
		println "File? ${f.isFile()}";
		println "Directory? ${f.isDirectory()}";
		
		def file1 = new File('Directory');
		file1.mkdir();
		
		//file.delete();
		
		def dst = new File("Example1.txt");
		dst << file.text;
		
		
      } 
   } 
}
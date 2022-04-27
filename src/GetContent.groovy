
class GetContent {
	static void main(String[] args) {
		def rootFiles = new File("Example.txt").listRoots()
		rootFiles.each {
		   file -> println file.absolutePath
		}
		
		def file = new File('/Users/yashkumar.chandaliya/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/').eachFile(){
			file->println file.getAbsolutePath();
		}
		
		def file1 = new File('/Users/yashkumar.chandaliya/Documents/workspace-spring-tool-suite-4-4.14.0.RELEASE/').eachFileRecurse(){
			file1->println file1.getAbsolutePath();
		}
	 }
	 

}
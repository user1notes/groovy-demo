
class Ranges {
	
	static void main(String[] args) {
		def rint = 1..10;
		println(rint.contains(10));
		println(rint.contains(11));
		println(rint.get(5));
		println(rint.getFrom());
		println(rint.getTo());
		
		for(int item: rint) {
			println(item)
		}
		
		def rint1 = 10..1;
		println(rint1.isReverse());
		
		println(rint.size())
		println(rint.subList(2, 5));
	}
}
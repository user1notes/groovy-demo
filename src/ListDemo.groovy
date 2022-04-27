
class ListDemo {
	
	static void main(String[] args) {
		def lst = [1,2,3,4,5];
		println(lst);
		lst.add(15);
		
		println(lst);
		lst.add(2,20);
			
        println(lst);
        
        println(lst.contains(2));
        println(lst.contains(12));
        
        println(lst.get(4));
        
        def newList = lst.minus([2,4]);
        println(newList);
        println(lst);
        
        lst.remove(2);
        println(lst);
        
        def reverseList = lst.reverse();
        println(reverseList);
        
        newList.sort();
        println(newList);
        
        lst.pop();
        println(lst);
        print(lst.size());
	}
}
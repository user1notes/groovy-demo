
class MapsDemo {
	
	static void main(String[] args) {
		def map = ['TopicName' : 'Lists', 'Author' : 'Raghav'];
		println(map.containsKey("TopicName"));
		println(map.containsKey("Topic"));
		
		println(map.get("TopicName"));
		println(map.get("Topic"));
		
		println(map.keySet());
		
		map.put("TopicId",1);
		println(map);
		
		println(map.size());
		
		println(map.values());

		
	}
}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Liststream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sam","Tom","Max","Leo");
		
		List<String> newlist = list.stream()
				.map(a->String.valueOf(a))
				.collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}

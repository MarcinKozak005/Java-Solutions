public class P35_JavaMap {
    public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            // My code
            map.put(name, phone);
            // End of my code
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            // My code
            Integer num = map.get(s);
            if(num!=null) System.out.println(s+"="+num);
            else System.out.println("Not found");
            // End of my code
		}
	}
}

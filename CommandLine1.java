class CommandLine1{
	public static void main(String args[]){
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}

		short a = Short.parseShort(args[0]);
		short b = Short.parseShort(args[1]);
		System.out.println(a+b);

	}
}
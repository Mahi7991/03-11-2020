class Evenorodd{
	public static void main(String args[])
	{
		int integers[]={12,97,34,99,28,33,51,75,67,10};
		for(int i=0;i<9;i++){
			if(integers[i]%2==0)
			{
				System.out.println(integers[i]+" is even");
			}
			else
			{
				System.out.println(integers[i]+" is odd");
			}
		}
	}
}
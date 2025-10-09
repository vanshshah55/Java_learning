public class a21_multidimensionalarray{
    public static void main(String[] a){
        int nums[][] = new int[3][4];
        //System.out.println(nums[0][2]);


        double random = 0;
        for(int i = 0; i<3;i++){
            for(int j = 0;j<4;j++){

                random=Math.random()*100;
                random = (int)random;

                nums[i][j] = (int)random;
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        // for(int i=0;i<3;i++)
		// {
		// 	for(int j=0;j<4;j++)
		// 	{
		// 		nums[i][j]=(int)Math.random()*100;
		// 		System.out.println(nums[i][j]);
		// 	}
		// 	System.out.println();
		// }
		
		
		// for(int i=0;i<3;i++)
		// {
		// 	for(int j=0;j<4;j++)
		// 	{
		// 		System.out.println(nums[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }


        //Enhanced LOOP
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
			System.out.println();
        }
    }
}
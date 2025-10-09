public class a22_jaggedand3darray {
    public static void main(String args[]){

        int nums[][] = new int[3][]; //jagged array
        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[5];


        System.out.println("JAGGED ARRAY");
        for(int i=0;i<3;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

         System.out.println();
          System.out.println();

        int nums2[][][]=new int[2][3][4];

        System.out.println("3D ARRAY");

        for(int i =0;i<2;i++){
            for(int j =0;j<3;j++){
                for(int k =0;k<4;k++){
                    nums2[i][j][k]=(int)(Math.random()*100);
                    System.out.print(nums2[i][j][k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }


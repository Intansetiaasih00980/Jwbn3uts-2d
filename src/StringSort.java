public class StringSort {
    public void StringSort(){
        int lenData = this.data.length;
        for (int i=0;i<lenData;i++){
            System.out.println("-------------------------");
            System.out.println("|  Untuk i = "+ i +"  |");
            System.out.println("-------------------------");
            for(int j=i+1<lenData;j++){
                System.out.println("\t--------------------------");
                System.out.println("\t|  \tUntuk j = "+j+"  |");
                System.out.println("\t--------------------------");
                if(this.data[j].compareTo(this.data[i])  0){
                    String temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                    for (String dataStep:this.data){
                        System.out.println("\t");
                        System.out.println(dataStep+"  ");
                    }
                }
                System.out.println(("\n"));
            }
            //code untuk menampilkan step by step
            System.out.println("Result Step "+(i+1)+"\n");
            for(String dataStep:this.data){
                System.out.print(dataStep+"  ");
            }
            System.out.println("\n\n");
        }
    }
}

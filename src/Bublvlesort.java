public class Bubblesort {
    private int[] data;

    //Constructor
    public Bubblesort(){
    }
    public int[] getData(){
        return data;
    }
    public void setData(int[] data){
        this.data = data;
    }
    public void sortData(){
        int lenData = this.data.lenght;
        for(int i = 0;i<lenData;i++){
            System.out.println("-------------");
            System.out.println("| untuk i = "+i +" |");
            System.out.println("-------------");
            for(int.data[j]<lenData;j++){
                System.out.println("\t--------------------------");
                System.out.println("\t| \tUntuk j = " +j+"  |");
                System.out.println("\t--------------------------");
                if(this.data[j]<this.data[i]){
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                    for(int dataSte:this.data){
                        System.out.println("\t");
                        System.out.println("");
                    }
                }
            }
        }
    }
}

import java.sql.SQLOutput;

public class BubbleSort {
    private int[] data;

    public Bubblesort(){
    }

    public int[] getData(){
        return data;
    }

    public void setData(int[] data){
        this.data=data;
    }

    public void sortData(){
        int lenData = this.data.lenght;
        for(int i = 0;1<lenData;i++){
            System.out.println("-----------------");
            System.out.println("| Untuk i = "+ i +"   |");
            System.out.println("-----------------");
            for(int j=i+1;<lenData;j++){
                System.out.println("------------------------");
                System.out.println("\t|  \tUntuk j = " +j+"    |");
                System.out.println("-------------------------");
                if(this.data[j]<this.data[i]){
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                    for(int dataStep:this.data){
                        System.out.println("\t");
                        System.out.println(dataStep+"  ");
                    }
                }
                System.out.println("\n"));
            }
            //code untuk memunculkan step by step
            System.out.println("Result Step "+(i+1)+"\n");
            for(int dataStep:this.data){
                System.out.println("dataStep+"  "");
            }
            System.out.println("\n\n");
        }
    }

    public static void main(String[] args){
        int[] modelTrain = new int[]{1002,456,267,47239.78476,63.64,629,92745,354629,5543};

        Bubblesort _myBubble = new Bubblesort();
        _myBubble.setData(modelTrain);
        _myBubble.setData();

        System.out.println("Final Result : ");
        _myBubble.PrintData();
    }
}

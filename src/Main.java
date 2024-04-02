import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) throws Exception{
        String filePath="C:\\Users\\18906\\Desktop\\Groceries.txt";
        String filewriter="C:\\Users\\18906\\Desktop\\ABC.txt";

        String [] array =new String[4];
        
        String id;
        String itemName;
        String quantity;
        String separator=",";
        double total=0;


        FileReader fileReader=new FileReader(filePath);
        FileWriter fileWriter=new FileWriter(filewriter);
        BufferedReader reader=new BufferedReader(fileReader);
        BufferedWriter writer=new BufferedWriter(fileWriter);
        
        
        String line;
        //line=reader.readLine();
        String heading="ID#"+"\t"+"Item"+"\t\t"+"Quantity"+"\t"+"Price($)"+".";
        System.out.println(heading);
        writer.write("*****************************************************");
        writer.newLine();
        writer.write(heading);
        writer.newLine();
        //writer.write("*****************************************************");
        while((line=reader.readLine())!=null){
            array=line.split(separator);
            id=array[0];
            itemName=array[1];
            quantity=array[2];
            double price = Double.parseDouble(array[3]);
            total+=price;
            line=id+"\t"+itemName+"\t\t"+quantity+"\t\t"+price+".";
            System.out.println(line);
            writer.write(line);
            writer.newLine();
            //line=reader.readLine();
        }
        System.out.println("\n"+"The total price is "+Math.round(total));
        writer.write("\n"+"The total price is "+Math.round(total)+"\n");
        writer.write("*****************************************************");
        reader.close();
        writer.flush();
        writer.close();

    }

    
}


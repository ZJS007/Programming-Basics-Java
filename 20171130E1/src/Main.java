import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream stream = new FileInputStream("://src//20171130E1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while ((line = buffer.readLine()) != null && !line.equals("")) {
            line= line.trim();
            String list[];
            list=line.split(" ");

            String inputSex = list[0];

            double inputHeight=Double.parseDouble(list[1]);

            double inputWeight = Double.parseDouble(list[2]);
            Person p = new Person(inputSex,inputHeight,inputWeight);
            p.output();
        }
        stream.close();
        return;
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Cycle {
static double numberOfWheels;
static double weight;	
public Cycle(double numberOfWheels, double weight){
this.numberOfWheels=numberOfWheels;
this.weight=weight;
//constructor of cycle
}
@Override
public String toString() {
return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
+ "]";
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName="Cycle.txt";
		File file =new File(fileName);
		PrintWriter output=null;
		try{
			output=new PrintWriter(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exist");
			//e.printStackTrace();
			throw e;
		}
		JTextField NumberOfWheels = new JTextField(10);
		JTextField Weight = new JTextField(10);
		JLabel label = new JLabel(
				"Enter number of wheels in the first textfield");
		JLabel label2 = new JLabel("Enter weight in the second textfield");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(label2);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		JOptionPane.showMessageDialog(null, panel);
		//prompt user to enter the number of wheels and weight
		numberOfWheels= Double.parseDouble(NumberOfWheels.getText());
		weight= Double.parseDouble(Weight.getText());
		//use constructor cycle
		Cycle cycle1=new Cycle(numberOfWheels, weight);
		output.println(cycle1.toString());
		System.out.println(cycle1.toString());
		System.out.println("Name of the file: "+file.getPath());
		System.out.println("File can be read: "+file.canRead());
		System.out.println("File can be written: "+file.canWrite());
		System.out.println("File exists: "+file.exists());
		System.out.println("Path of the file: "+file.getAbsolutePath());
		System.out.println("File is directory: "+file.isDirectory());
		System.out.println("File is hidden: "+file.isHidden());
		System.out.println("File is file: "+file.isFile());
		output.close();
		//close the file
	}
}
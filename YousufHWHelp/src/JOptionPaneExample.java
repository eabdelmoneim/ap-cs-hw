import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author eiman
 *
 */
public class JOptionPaneExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the start number using input dialog
		String xString = JOptionPane.showInputDialog("Enter the start number");
		int start = Integer.parseInt(xString);
		System.out.println("Start value=" + start);
		
		// get the end number using input dialog
		String yString = JOptionPane.showInputDialog("Enter the end number");
		int end = Integer.parseInt(yString);
		System.out.println("End value=" + end);
		
		System.out.println("Start loop from " + start + " to " + end);
		// loop from start to end and print out each increment
		for(int i=start; i<=end; i++) {
			System.out.println("Value: " + i);
		}
		System.out.println("End of loop");
		
	}

}

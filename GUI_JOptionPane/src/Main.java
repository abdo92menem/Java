import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		/* JOptionPane = pop up a standard dialog box that prompts user for value
		 *				 or inform them of something 
		 *
		 */
		
		
		// showMessageDialog
//		JOptionPane.showMessageDialog(null, "this is me", "ME", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this is me", "ME", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this is me", "ME", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this is me", "ME", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "this is me", "ME", JOptionPane.ERROR_MESSAGE);
		
		// showConfirmDialog
		//JOptionPane.showConfirmDialog(null, "Do you even code", "Coder", JOptionPane.YES_NO_CANCEL_OPTION);
		//JOptionPane.showConfirmDialog(null, "Do you even code", "Coder", JOptionPane.CANCEL_OPTION);
		
		// showInputDialog
		//System.out.println(JOptionPane.showInputDialog("What is your name?: "));
		
		//
		JOptionPane.showOptionDialog(null, "You are kind", "Secret", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
		
		
	}

}

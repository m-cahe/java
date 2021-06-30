import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ex03mypage {

	private JFrame frame;

	public ex03mypage(String name) {
		initialize(name);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_name = new JLabel(name);
		lbl_name.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 30));
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(55, 90, 368, 130);
		frame.getContentPane().add(lbl_name);
	}

}

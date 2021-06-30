package guipractioce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex_02gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_02gui window = new ex_02gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex_02gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(154, 205, 50));
		frame.getContentPane().setBackground(UIManager.getColor("info"));
		frame.getContentPane().setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		frame.setBounds(100, 100, 453, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(24, 29, 401, 450);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_title = new JLabel("Moving GUI");
		lbl_title.setForeground(new Color(173, 255, 47));
		lbl_title.setFont(new Font("궁서체", Font.ITALIC, 30));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setBounds(54, 31, 267, 83);
		panel.add(lbl_title);

		JButton btn_move = new JButton("Teleport!");
		btn_move.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
//창을 이동하기!
				// ex_01GUI클래스가 가지고 있는 기능 중에 main 메소트 호출
				ex_01GUI.main(null);
				frame.dispose();

			}
		});
		btn_move.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		btn_move.setBackground(Color.MAGENTA);
		btn_move.setForeground(new Color(139, 0, 0));
		btn_move.setBounds(46, 144, 275, 99);
		panel.add(btn_move);
	}

}

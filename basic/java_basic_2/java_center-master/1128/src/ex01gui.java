import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ex01gui {

	private JFrame frame;
	private JTextField text_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex01gui window = new ex01gui();
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
	public ex01gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//		상대 경로를 가져오는 방법!
		// 이미지 가져오는 방법
//						하나의 공식			클래스().리소스().겟패스()
		Image image = new ImageIcon(getClass().getResource("/down.jfif")).getImage();
		image = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
//		멈춰있는 사진 스무스 움직이는사진 default

		JLabel lbl_image = new JLabel(new ImageIcon(image));

		lbl_image.setBounds(12, 25, 500, 500);
		frame.getContentPane().add(lbl_image);

		text_txt = new JTextField();
		text_txt.setBounds(12, 388, 396, 70);
		frame.getContentPane().add(text_txt);
		text_txt.setColumns(10);
		// 텍스트필드 투명하게 만드는 방법
		// 1. 배경 없애기
		// 2. 경계 없애기
		text_txt.setOpaque(false);
		text_txt.setBorder(null);

	}
}

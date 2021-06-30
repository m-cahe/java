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
//		��� ��θ� �������� ���!
		// �̹��� �������� ���
//						�ϳ��� ����			Ŭ����().���ҽ�().���н�()
		Image image = new ImageIcon(getClass().getResource("/down.jfif")).getImage();
		image = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
//		�����ִ� ���� ������ �����̴»��� default

		JLabel lbl_image = new JLabel(new ImageIcon(image));

		lbl_image.setBounds(12, 25, 500, 500);
		frame.getContentPane().add(lbl_image);

		text_txt = new JTextField();
		text_txt.setBounds(12, 388, 396, 70);
		frame.getContentPane().add(text_txt);
		text_txt.setColumns(10);
		// �ؽ�Ʈ�ʵ� �����ϰ� ����� ���
		// 1. ��� ���ֱ�
		// 2. ��� ���ֱ�
		text_txt.setOpaque(false);
		text_txt.setBorder(null);

	}
}

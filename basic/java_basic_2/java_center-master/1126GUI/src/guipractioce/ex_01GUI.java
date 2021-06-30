package guipractioce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex_01GUI {

	private JFrame frame;
	private JTextField txtGgg;
	private JLabel lbl_test;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// Ư�� �̺�Ʈ�� �߻������� �̺�Ʈ�� ó�����ִ� ��ü(������)�� ������

			public void run() {
				try {//ex01gui�� �ǹ��ϴ°� �츮�� ���� Ŭ���� ����� �̸�
					//window ���������� ����ϰڴ�.
					ex_01GUI window = new ex_01GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});//�ѹ� ���� ������ lal
	}

	public ex_01GUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		//frame�����ϰڴ�
		//(x, y, ����, ����)
		frame.setBounds(100, 100, 665, 586);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(68, 50, 513, 445);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_title = new JLabel("GUItest");
		lbl_title.setFont(new Font("Segoe Print", Font.BOLD, 24));
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setForeground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		lbl_title.setBackground(Color.LIGHT_GRAY);
		lbl_title.setBounds(12, 0, 288, 73);
		panel.add(lbl_title);

		txtGgg = new JTextField();
		txtGgg.setBounds(37, 83, 263, 66);
		panel.add(txtGgg);
		txtGgg.setColumns(10);

		JButton btn_enter = new JButton("click!!!");
		btn_enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Event�� ������ ��� Ư�������� �� ���ο� �ۼ��Ѵ�!!!!!!!!!
				// textField -> Components���� �ؽ�Ʈ �������� �۾�!!!!!!!!

				// textField���� ���� �������� �޼ҵ�
				String text = txtGgg.getText();
				System.out.println(text);
				txtGgg.setText("");
				// �����lbl_text<--textField���� ������ �� ���ڸ� �ֱ�!!!
				lbl_test.setText(text);
			}
		});
		btn_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_enter.setFont(new Font("Segoe Script", Font.ITALIC, 30));
		btn_enter.setForeground(Color.RED);
		btn_enter.setBounds(12, 173, 288, 77);
		panel.add(btn_enter);

		lbl_test = new JLabel("");
		lbl_test.setBounds(12, 270, 288, 48);
		panel.add(lbl_test);
	}
}

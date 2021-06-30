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
			// 특정 이벤트가 발생했을때 이벤트를 처리해주는 객체(스레드)를 ㅂ생성

			public void run() {
				try {//ex01gui가 의미하는건 우리가 만든 클래스 설계또 이름
					//window 변수명으로 사용하겠다.
					ex_01GUI window = new ex_01GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});//한번 쓰고 버리는 lal
	}

	public ex_01GUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		//frame생성하겠다
		//(x, y, 넓이, 높이)
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
				// Event에 관련한 어떠한 특정행위는 이 내부에 작성한다!!!!!!!!!
				// textField -> Components에서 텍스트 가져오는 작업!!!!!!!!

				// textField에서 글자 가져오는 메소드
				String text = txtGgg.getText();
				System.out.println(text);
				txtGgg.setText("");
				// 투명라벨lbl_text<--textField에서 가지고 온 글자를 넣기!!!
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

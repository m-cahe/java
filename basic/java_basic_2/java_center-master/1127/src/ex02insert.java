import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.DAO;
import model.insertVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex02insert {

	private JFrame frame;
	private JTextField textField_id;
	private JTextField textField_pw;
	private JTextField textField_name;
	private JTextField textField_age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02insert window = new ex02insert();
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
	public ex02insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(110, 130, 532, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl_joinMembership = new JLabel("join Membership");
		lbl_joinMembership.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_joinMembership.setBounds(48, 23, 406, 52);
		frame.getContentPane().add(lbl_joinMembership);

		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(63, 114, 66, 39);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("Password");
		lbl_pw.setBounds(63, 182, 66, 39);
		frame.getContentPane().add(lbl_pw);

		JLabel lbl_name = new JLabel("Name");
		lbl_name.setBounds(63, 252, 66, 39);
		frame.getContentPane().add(lbl_name);

		JLabel lbl_age = new JLabel("Age");
		lbl_age.setBounds(63, 322, 66, 39);
		frame.getContentPane().add(lbl_age);

		textField_id = new JTextField();
		textField_id.setBounds(151, 115, 286, 39);
		frame.getContentPane().add(textField_id);
		textField_id.setColumns(10);

		textField_pw = new JTextField();
		textField_pw.setColumns(10);
		textField_pw.setBounds(151, 183, 286, 39);
		frame.getContentPane().add(textField_pw);

		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(151, 253, 286, 39);
		frame.getContentPane().add(textField_name);

		textField_age = new JTextField();
		textField_age.setColumns(10);
		textField_age.setBounds(151, 323, 286, 39);
		frame.getContentPane().add(textField_age);

		JButton btn_joinMembership = new JButton("join Mebership Sucess!!");
		btn_joinMembership.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// textfield에 있는 값을 가지고 와셔 변수에 저장
				// id, pw, name, age 저장
				String id = textField_id.getText();
				String pw = textField_pw.getText();
				String name = textField_name.getText();
				int age = Integer.parseInt(textField_age.getText());
//DAO 클래스 불러오기

				DAO dao = new DAO();
				int result = dao.insert(new insertVO(id, pw, name, age));
				if (result > 0) {
					// 팝업창 띄우기
					JOptionPane.showMessageDialog(null, "회원가입 성공", "회원가입 성공창", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "회원가입 실패", "회원가입 실패창", JOptionPane.ERROR_MESSAGE);
				}
				ex01login.main(null);
				frame.dispose();
			}

		});
		btn_joinMembership.setBounds(76, 419, 344, 39);
		frame.getContentPane().add(btn_joinMembership);

	}

}

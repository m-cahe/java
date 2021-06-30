import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import DAO.DAO;
import model.insertVO;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ex04select {

	private JFrame frame;
	private JTable table;
	private ArrayList<insertVO> list;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex04select window = new ex04select();
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
	public ex04select() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 511, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(24, 25, 435, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "name_91139383362300");


		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btn_select = new JButton("get it!!!!");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				// dao에서 셀렉트 기능 만들어서
				// 스마트 멤버안에 있는 모든 값 가져오기
				DAO dao = new DAO();
				list = dao.allSelect();
// q1.이차원배열 만들기
				String[] column = { "ID", "PW", "name", "age" };
				Object[][] data = new Object[list.size()][column.length];
				for (int i = 0; i < list.size(); i++) {
					data[i][0] = list.get(i).getId();
					data[i][1] = list.get(i).getPw();
					data[i][2] = list.get(i).getName();
					data[i][3] = list.get(i).getAge();
				}
				for (int j = 0; j < data.length; j++) {
					for (int i = 0; i < data[j].length; i++) {
						System.out.println(data[j][i]);
					}
					System.out.println();
				}
				//table 데이터 추가
				table.setModel(new DefaultTableModel(data, column));
				
			}
		});

		btn_select.setFont(new Font("Bahnschrift", Font.ITALIC, 38));
		btn_select.setBounds(35, 473, 420, 63);
		frame.getContentPane().add(btn_select);

	}
}

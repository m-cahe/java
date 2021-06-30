import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import au.com.bytecode.opencsv.CSVReader;

public class ex02chart {

	private JFrame frame;
	private DefaultPieDataset dataSet = new DefaultPieDataset();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02chart window = new ex02chart();
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
	public ex02chart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// ������ ������ �ֱ� pie��Ʈ �׸���
		// ����, ������
		dataSet = getData();
		JFreeChart chart = ChartFactory.createPieChart("boxoffice", dataSet);
		// �ٿ�ĳ���� �θ� �ڽ� ���ϰ������
		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setLabelFont(new Font("����", Font.BOLD, 16));

		frame = new ChartFrame("boxoffice", chart);
		frame.setBounds(100, 100, 674, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private DefaultPieDataset getData() {
//csv ���� �о����
//comma separated valuesA
		try {
			CSVReader reader = new CSVReader(new FileReader("C:\\Users\\smhrd\\Desktop\\boxoffice2019.csv"));
			String[] list;
			int check = 0;// csv �ȿ� ������ ���� ���Ƽ� ���߿��� 5�������� ������ �� ����
			while ((list = reader.readNext()) != null) {
				check++;
				if (check > 1) {
					// piedataset (����, ����)
					dataSet.setValue(list[0], Long.parseLong(list[1].replace(" ", "")));
					if (check > 2) {
						break;
					}
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return dataSet;
	}

}

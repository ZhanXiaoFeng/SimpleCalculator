package SimpleCalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/*
 * ���׼������������
 */
public class SimpleCalculator extends JFrame {
	// ��������������Ҫ��ȫ�ֱ���
	// �������ְ�ť
	private NumberBtn numberBtn[];
	private OperationBtn operationBtn[];
	private JButton point, sign, backspace, equals, zero, sin, sqrt, reci;
	// ��ʾ��ǰ������
	private JTextField txtResult;
	// �����ŵ�һ����������������͵ڶ���������
	private LinkedList<String> numList;
	// ������ActionEvent�¼�
	private NumberListener numberListener;
	private OperationListener operationListener;
	private BackspaceListener backListener;
	private ClearListener clearListener;
	private EqualListener equalListener;
	private PointListener pointListener;
	private ReverseListener revListener;
	private SinListener sinListener;
	private SqrtListener sqrtListener;
	private ReciprocalListener reciListener;

	/*
	 * ���췽��
	 */
	public SimpleCalculator() {
		this.setTitle("���׼�����");
		this.numList = new LinkedList<String>();

		// �����ʾ��
		this.txtResult = new JTextField(10);
		this.txtResult.setHorizontalAlignment(JTextField.RIGHT);
		this.txtResult.setForeground(Color.blue);
		this.txtResult.setFont(new Font("TimesRoman", Font.BOLD, 20));
		this.txtResult.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		this.txtResult.setEditable(false);
		this.txtResult.setBackground(Color.white);

		// ���ְ�ť
		this.numberBtn = new NumberBtn[10];
		this.numberListener = new NumberListener(this.numList, this.txtResult);
		for (int i = 0; i <= 9; i++) {
			this.numberBtn[i] = new NumberBtn(i);
			this.numberBtn[i].setFont(new Font("Arial", Font.BOLD, 18));
			this.numberBtn[i].addActionListener(this.numberListener);
		}

		// ������ť
		this.operationBtn = new OperationBtn[4];
		this.operationListener = new OperationListener(this.numList, this.txtResult);
		String calculator[] = { "+", "-", "*", "/" };
		for (int i = 0; i < 4; i++) {
			this.operationBtn[i] = new OperationBtn(calculator[i]);
			this.operationBtn[i].setFont(new Font("Arial", Font.BOLD, 18));
			this.operationBtn[i].addActionListener(this.operationListener);
		}
		// ������ذ�ť
		this.sin = new JButton("sin");
		this.sinListener = new SinListener(this.numList, this.txtResult);
		this.sin.addActionListener(sinListener);
		this.sin.setForeground(Color.blue);

		this.sqrt = new JButton("sqrt");
		this.sqrtListener = new SqrtListener(this.numList, this.txtResult);
		this.sqrt.addActionListener(sqrtListener);
		this.sqrt.setForeground(Color.blue);

		this.sign = new JButton("+/-");
		this.revListener = new ReverseListener(this.numList, this.txtResult);
		this.sign.addActionListener(revListener);
		this.sign.setForeground(Color.blue);

		this.equals = new JButton("=");
		this.equalListener = new EqualListener(this.numList, this.txtResult);
		this.equals.addActionListener(equalListener);
		this.equals.setForeground(Color.red);

		this.point = new JButton(".");
		this.pointListener = new PointListener(this.numList, this.txtResult);
		this.point.addActionListener(pointListener);
		this.point.setForeground(Color.blue);

		this.reci = new JButton("1/x");
		this.reciListener = new ReciprocalListener(this.numList, this.txtResult);
		this.reci.addActionListener(reciListener);
		this.reci.setForeground(Color.blue);

		// �˸�����Ⱥż���ʹ��
		this.backspace = new JButton("�˸�");
		this.backListener = new BackspaceListener(this.numList, this.txtResult);
		this.backspace.addActionListener(backListener);
		this.backspace.setFont(new Font("΢���ź�", Font.BOLD, 16));
		this.backspace.setForeground(Color.orange);

		this.zero = new JButton("����");
		this.clearListener = new ClearListener(this.numList, this.txtResult);
		this.zero.addActionListener(clearListener);
		this.zero.setFont(new Font("΢���ź�", Font.BOLD, 16));
		this.zero.setForeground(Color.orange);

		// ������Ʒ�Ϊ������
		JPanel panelDown, panelUp;

		panelUp = new JPanel(new BorderLayout());
		panelUp.add(this.txtResult, BorderLayout.CENTER);

		panelDown = new JPanel();
		panelDown.setLayout(new BorderLayout());

		JPanel NorthInRight = new JPanel();
		JPanel centerInRight = new JPanel();
		JPanel SouthInRight = new JPanel();
		panelDown.add(NorthInRight, BorderLayout.NORTH);
		NorthInRight.setLayout(new GridLayout(1, 2, 30, 30));
		NorthInRight.add(zero);
		NorthInRight.add(backspace);

		// �ָ���
		JSplitPane split1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, NorthInRight, centerInRight);
		panelDown.add(split1, BorderLayout.NORTH);
		panelDown.add(centerInRight, BorderLayout.WEST);
		centerInRight.setLayout(new GridLayout(4, 3, 10, 8));
		centerInRight.add(numberBtn[7]);
		centerInRight.add(numberBtn[8]);
		centerInRight.add(numberBtn[9]);
		centerInRight.add(numberBtn[4]);
		centerInRight.add(numberBtn[5]);
		centerInRight.add(numberBtn[6]);
		centerInRight.add(numberBtn[1]);
		centerInRight.add(numberBtn[2]);
		centerInRight.add(numberBtn[3]);
		centerInRight.add(numberBtn[0]);
		centerInRight.add(point);
		centerInRight.add(reci);

		// �ָ���
		JSplitPane split2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, centerInRight, SouthInRight);
		panelDown.add(split2, BorderLayout.CENTER);
		panelDown.add(SouthInRight, BorderLayout.EAST);
		SouthInRight.setLayout(new GridLayout(4, 2, 10, 8));
		SouthInRight.add(operationBtn[0]);
		SouthInRight.add(sin);
		SouthInRight.add(operationBtn[1]);
		SouthInRight.add(sqrt);
		SouthInRight.add(operationBtn[2]);
		SouthInRight.add(sign);
		SouthInRight.add(operationBtn[3]);
		SouthInRight.add(equals);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelUp, panelDown);
		add(split, BorderLayout.CENTER);
		setVisible(true);
		setBounds(500, 350, 450, 280);
		validate();
	}

	/*
	 * ���׼������������е����������
	 */
	public static void main(String[] args) {
		new SimpleCalculator();
	}
}
